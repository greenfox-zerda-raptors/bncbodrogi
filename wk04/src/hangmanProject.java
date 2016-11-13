
import java.util.Scanner;

public class hangmanProject {

    static Scanner userInput = new Scanner (System.in);

    public static void main(String[] args) {

        String theWord = enterWordToGuess();

        System.out.println(executionGroundBuilder(0));
        System.out.println(gameGround("aaaaaaaaa", 'b'));
        System.out.println(initialMessageChooser(checkLetter(letterGuessed(), theWord)));

    }
    public static String enterWordToGuess (){
        System.out.println("Enter the word to guess");
        String wordToGuess = userInput.next().toString().toUpperCase();
        System.out.println("Good choice sir, \"" + wordToGuess + "\" it is.  Press \"Enter\" and I'll scroll the display.");
        return wordToGuess;
    }
    public static String executionGroundBuilder (int groundNumber) {
        String executionGround01 = new String(
                "Starting!!!   \n"+
                "    +------+\n" +
                "       |      |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                " +----------+ |");

        String executionGround02 = new String(
                "    +------+\n" +
                "       |      |\n" +
                "       0      |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                " +----------+ |");

        String executionGround03 = new String(
                "    +------+\n" +
                "       |      |\n" +
                "       0      |\n" +
                "       |      |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                " +----------+ |");

        String executionGround04 = new String(
                "    +------+\n" +
                "       |      |\n" +
                "       0      |\n" +
                "       |      |\n" +
                "     /+++\\   |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                " +----------+ |");


        String executionGround05 = new String(
                "    +------+\n" +
                "       |      |\n" +
                "       0      |\n" +
                "       |      |\n" +
                "     /+++\\   |\n" +
                "    / +++ \\  |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                " +----------+ |");

        String executionGround06 = new String(
                "    +------+\n" +
                "       |      |\n" +
                "       0      |\n" +
                "       |      |\n" +
                "     /+++\\   |\n" +
                "    / +++ \\  |\n" +
                "      | |     |\n" +
                "              |\n" +
                "              |\n" +
                "              |\n" +
                " +----------+ |");

        String executionGround07 = new String(
                "    +------+\n" +
                "       |      |\n" +
                "       0      |\n" +
                "       |      |\n" +
                "     /+++\\   |\n" +
                "    / +++ \\  |\n" +
                "      | |     |\n" +
                "      | |     |\n" +
                "              |\n" +
                "              |\n" +
                " +----------+ |");

        String executionGround08 = new String(
                "    +------+\n" +
                "       |      |\n" +
                "       0      |\n" +
                "       |      |\n" +
                "     /+++\\   |\n" +
                "    / +++ \\  |\n" +
                "      | |     |\n" +
                "      | |     |\n" +
                "      M M     |\n" +
                "              |\n" +
                " +----------+ |");


        if (groundNumber == 0) {
            return executionGround01;
        }else if ( groundNumber== 1){
            return executionGround02;
        }else if ( groundNumber== 2){
            return executionGround03;
        }else if ( groundNumber== 3){
            return executionGround04;
        }else if ( groundNumber== 4){
            return executionGround05;
        }else if ( groundNumber== 5){
            return executionGround06;
        }else if ( groundNumber== 6){
            return executionGround07;
        }else{
            return executionGround08;
        }

    }
    public static String initialMessageChooser (boolean contains){

        String initialRight = new String ("There is a(n) ");

        String initialWrong = new String ("There is no ");

        if ( contains == true){
            return initialRight;
        }else{
            return initialWrong;
        }
    }
    public static String gameGround (String wordToGuess, char letter) {

        StringBuilder theWord = new StringBuilder();
        theWord.append(wordToGuess);
        StringBuilder hiddenWord = new StringBuilder();
        String letterStr = String.valueOf(letter);

        for (int i = 0; i < wordToGuess.length(); i++) {
            if (theWord.charAt(i) == ' ') {
                hiddenWord.append(" ");
            } else if (theWord.charAt(i) == letter) {
                hiddenWord.append(letterStr);
            }else{
                hiddenWord.append("-");
            }
        }
            String baseLine =
                            "  " +hiddenWord    +
                            "\n +----------+\n";
            return baseLine;
    }
    public static char letterGuessed (){
        System.out.println("Enter a letter");

        char letter = userInput.next().toUpperCase().charAt(0);

        return letter;
    }
    public static boolean checkLetter (char letter, String wordToGuess){
        String letterStr = String.valueOf(letter);
        return wordToGuess.contains(letterStr);
    }
    public static int counter (int groundNumber, boolean contains){
        if (contains == false && groundNumber < 8) {
            groundNumber++;
            }
        return groundNumber;
    }

}


