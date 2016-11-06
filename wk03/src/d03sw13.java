
public class d03sw13 {
    public static void main(String[] args) {
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };
        // print the sum of all numbers in ah

        int ahsum = 0;

        for (int i = 0; i < ah.length; i++){
            ahsum = ahsum + ah[i];
        }

        System.out.println(ahsum);

    }
}
