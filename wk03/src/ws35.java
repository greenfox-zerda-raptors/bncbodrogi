
public class ws35 {
    public static void main(String[] args) {
        // Write a program which has this output
        // 1******
        // 12*****
        // 123****
        // 1234***
        // 12345**
        // 123456*
        // 1234567

        int i;
        int y;

        for (y=0; y<7; y++){
            for (i=0; i<=7; i++){
                if (i <= y){
                    System.out.print(i + 1);
                }else if (i == 7) {
                    System.out.println("");
                }else{
                    System.out.print("*");

                }
            }
        }
    }
}
