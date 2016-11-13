import java.util.Arrays;

public class abbreviator {
    public static void main(String[] args) {
        String otherLine = "elephant-rides are really fun!";


            System.out.println(abbrev(otherLine));



    }

    public static String abbrev(String line){

        String[] words = line.split("[^A-Za-z]");
        String[] originals = line.split("[^A-Za-z]");
        for (int i = 0; i < words.length; i++){
            int replacedLetters = words[i].substring(1, words[i].length()-1).length();
            if (words[i].length() > 3){
                words[i] = words[i].charAt(0) + Integer.toString(replacedLetters) + words[i].charAt(words[i].length()-1);
            }
            line = line.replace(originals[i], words[i]);
        }

        return line;
    }
}
