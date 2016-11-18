package app.todolist;

import java.util.Scanner;

public class UserInput {
    static String uIn;

    public static String getUserInput() {
        Scanner userInput = new Scanner(System.in);
        uIn = userInput.next();
        return uIn;
    }
}
