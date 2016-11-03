
public class ws36 {
    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // The # character should be replacable, hence store it in a variable

        String out = "#";
        int i;
        int y;
            for (y=0; y<5; y++) {
                for (i = 0; i < 6; i++) {
                    if (i !=5) {
                        System.out.print(out + " ");
                    }else{
                        System.out.println("");
                    }
                }
            }
        }
    }

