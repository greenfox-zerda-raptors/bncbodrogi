
public class d03ws22 {
    public static void main(String[] args) {
        // create a function which prints the input String parameters (can have multiple number of arguments)

        String testOne = "This is a string to test this bloody function " +
                "4 days after its due date around quarter to 9 in the evening";
        String testTwo = "This one is also a string with the same purpose";
        String testThree = "Well guess what mother fucker";
        String testFour = "Yeah you guessed right";
        String testFive = "No offense though";

        printStrings(testOne, testTwo, testThree, testFour, testFive);

    }

    public static void printStrings(String... tests) {
        for (String ts : tests) {
            System.out.println(ts);

        }

    }
}