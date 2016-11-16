import java.util.*;
import java.text.DecimalFormat;

public class Student extends Person {

    static List<Integer> grades = new ArrayList<>();
    static Scanner gradesInput = new Scanner(System.in);
    static String average = getAverage();

    public Student (){
        super();
    }

    public Student (String name, int age){
        super(name, age);

    }

    public static List<Integer> addGrade(){
        int grade;
        System.out.println("please enter grades:(1-5) or \"0\" for exit ");
        do{
            grade = gradesInput.nextInt();
            if (grade >= 6 || grade < 0){
                System.out.println("Please enter a valid grade");
            }else if (grade == 0) {
                System.out.println("bye!");
            }else{
                grades.add(grade);
            }
        }while(grade > 0);

        System.out.println(grades);
        return grades;
    }

    public static String getAverage(){

        DecimalFormat df = new DecimalFormat("#.##");

        addGrade();
        float average = 0;
        for (float grade : grades) {
            average = average + grade;
        }
        average = average/grades.size();

        return df.format(average);

    }

    public String toString() {
        return super.toString() + " and my average grade is: " + average;
    }
}

