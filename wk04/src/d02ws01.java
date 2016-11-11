import java.util.InputMismatchException;
import java.util.Scanner; // Library that allows us to capture user input
import java.util.*; // Allows me to check for InputMismatchException
import java.io.*; // Allows for system input and output through data streams, serialization and the file system

public class d02ws01 {
        public static void main(String[] args){
            String[] numbers = new String[] { "one", "two", "three", "four", "five"};

            for(int i = 0; i <= numbers.length; i++) {
                System.out.print(i);
                badIndex(i, numbers);

            }

            System.out.println("::::FINISH LINE::::");
        }

    public static void badIndex(int i, String numbers[]) {

        try {
            System.out.print("=" + numbers[i] + "\n");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("");
        }
    }
}