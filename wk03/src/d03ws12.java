import java.util.StringJoiner;

public class d03ws12 {
    public static void main(String[] args) {

        // Swap the first element of the array
        // Expected outpt: third second first
        String[] abc = new String[] { "first", "second", "third" };

        String placeholder;
        placeholder = abc[0];
        abc[0] = abc[2];
        abc[2] = placeholder;


        for(int i = 0; i < abc.length; i++){
            System.out.print(abc[i] + " ");
        }
    }
}

