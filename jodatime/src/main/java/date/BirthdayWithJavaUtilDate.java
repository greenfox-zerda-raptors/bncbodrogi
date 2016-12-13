package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public final class BirthdayWithJavaUtilDate implements BirthdayCalculator<Date> {

    @Override
    public Date parseDate(String str) {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date formattedDate = null;
        try {
            formattedDate = formatter.parse(str);
        } catch (ParseException e) {
            System.out.println("please enter valid format (yyy-MM-dd)");
        }
        return formattedDate;
    }

    @Override
    public String printMonthAndDay(Date date) {
        // TODO - return the date formatted: month & day (MM. dd.)

        DateFormat df = new SimpleDateFormat("MM. dd.");
        String monthAndDay = df.format(date);

        return monthAndDay;
    }

    @Override
    public boolean isAnniversaryToday(Date date) {
        // TODO - return with true if today is the same month+day as date

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date today = Calendar.getInstance().getTime();

        if (df.format(date).toString().substring(5, 10).equals(df.format(today).toString().substring(5, 10))){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int calculateAgeInYears(Date birthday) {
        // TODO - return how many years age the input date 'birthday' was

        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        String currentYear = df.format(Calendar.getInstance().getTime());
        String birthdayYear = df.format(birthday);

        int ageInYears = 0;
        if(Integer.valueOf(currentYear.substring(4, 8)) >= Integer.valueOf(birthdayYear.substring(4, 8))){

            ageInYears = (Integer.valueOf(currentYear.substring(0, 4)) - Integer.valueOf(birthdayYear.substring(0, 4)));

        }
        return ageInYears;
    }

    @Override
    public int calculateDaysToNextAnniversary(Date date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)

        GregorianCalendar today = new GregorianCalendar();
        Calendar birthday = Calendar.getInstance();
        birthday.setTime(date);


        System.out.println(today.get(Calendar.DAY_OF_YEAR));
        System.out.println(birthday.get(Calendar.DAY_OF_YEAR));

        int day;

        if (today.get(Calendar.YEAR) % 4 == 0) {
            if (birthday.get(Calendar.DAY_OF_YEAR) > today.get(Calendar.DAY_OF_YEAR)) {
                day = birthday.get(Calendar.DAY_OF_YEAR) - today.get(Calendar.DAY_OF_YEAR) -1;
            } else {
                day = (birthday.get(Calendar.DAY_OF_YEAR) + (365 - today.get(Calendar.DAY_OF_YEAR)) -1);

            }
        }else{
            if (birthday.get(Calendar.DAY_OF_YEAR) > today.get(Calendar.DAY_OF_YEAR)) {
                day = birthday.get(Calendar.DAY_OF_YEAR) - today.get(Calendar.DAY_OF_YEAR);
            } else {
                day = (birthday.get(Calendar.DAY_OF_YEAR) + (365 - today.get(Calendar.DAY_OF_YEAR)));
            }
        }

        return day;
    }

    public static void main(String[] args) {
        new BirthdayWithJavaUtilDate().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        Date birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");

}
