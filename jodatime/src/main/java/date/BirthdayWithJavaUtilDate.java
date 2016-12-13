package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

        Date today = Calendar.getInstance().getTime();
        if (date.compareTo(today) == 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int calculateAgeInYears(Date birthday) {
        // TODO - return how many years age the input date 'birthday' was

        int ageInYears = (int) (Integer.valueOf(Calendar.getInstance().getTime().toString()) - birthday.getTime());

        return ageInYears;
    }

    @Override
    public int calculateDaysToNextAnniversary(Date date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)


        return -1;
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
