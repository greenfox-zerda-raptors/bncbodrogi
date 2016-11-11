
public class d03ws14 {
    public static void main(String[] args) {
        int[] ah = new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] ha = new int[ah.length];
        // Reverse the order of ah


        for (int i = ah.length-1; i >= (ah.length/2); i--) {
            ha[i] = ah[i];
            ah[i] = ah[(ah.length-1) - i];
            ah[(ah.length-1) - i] = ha[i];
        }

        for (int i = 0; i <ah.length; i++) {
            System.out.println(ah[i]);
        }
    }
    /*public static int[] counter (int[] from){
        int to[];
        for (int i=5; i>0; i--){
            from[i] = to [i];
        }
        return to[];
    }*/
}