

public class ws22 {
    public static void main(String[] args) {

        String first = "I am the first string!";
        String second = "I think I'm longer than first..";
        int firstLength = first.length();
        int secondLength = second.length();


        // Decide if "first" string is longer than "second" string and store it in a variable
        // Print the value of the variable

        if (firstLength > secondLength) {
            System.out.println(firstLength);
        }else{
            System.out.println(secondLength);
        }
    }
}
