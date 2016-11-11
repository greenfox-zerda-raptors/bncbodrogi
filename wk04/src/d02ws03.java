
import java.util.InputMismatchException;
import java.util.Scanner;

public class d02ws03 {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        while (print() == 0) {
            print();
        }
            System.out.println("Bye!");
        }


    public static Integer checkIntSize () {
        try {
            return userInput.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
            userInput.nextLine();
            return -1;
        }

    }

    public static int print () {
        System.out.println("Valid number please or 0 for exit");
        int num = checkIntSize();
        if (num == 0) {
            return 1;
        } else if (num == -1){
            return 0;
        }else{
            String printableNumber = String.valueOf(num);
            System.out.println("Yum " + printableNumber.substring(0, ((printableNumber.length()+1) /2)));
            return 0;
        }

    }
}

