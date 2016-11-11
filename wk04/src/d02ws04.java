import java.util.*;

public class d02ws04 {
    public static void main(String[] args) {
        int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8};
        String two = "2";

        try {
            System.out.println("Testing ...");
            a[2] = a[3] / a[0];
        }
        catch (ArithmeticException e) {
            System.out.println("Past hurdle 1");
        }

        try {
            a[9] = Integer.parseInt(two);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Past hurdle 2");
        }

        try {
            a[10] = Integer.parseInt("ten");
        }
        catch (NumberFormatException e) {
            System.out.println("Past hurdle 3...  And I realized perhaps I'm wrong");
        }

        try {
            a[10] = 10;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Past hurdle 4");
        }

        try {
            two = "two";
            System.out.println("Past hurdle 5");
        }
        catch (NumberFormatException e) {
            System.out.println("Past hurdle 5");
        }

        try {
            a[9] = Integer.parseInt(two);
        }
        catch (NumberFormatException e){
            System.out.println("Done");
        }


    }
}
