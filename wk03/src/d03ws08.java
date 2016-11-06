
public class d03ws08 {
    public static void main(String[] args) {
        // Task 1: Create (dynamically) a two dimensional array with the following matrix. Use a loop!
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1

        // Task 2: Print this two dimensional array to the output

        int horizontal [][] = new int [4][4];

        for (int i = 0; i < 4; i++){
            for (int y = 0; y < 4; y++){
                if (i == y) {
                    horizontal[i][y] = 1;
                }else{
                    horizontal[i][y] = 0;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 4; y++) {
                System.out.print(horizontal[i][y] + " ");
            }
            System.out.println("");
        }
    }
}

