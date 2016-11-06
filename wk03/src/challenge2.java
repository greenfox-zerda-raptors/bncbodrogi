
public class challenge2 {
    public static void main(String[] args) {

        //Loop printing out prime numbers from 2 to 100

        int i=10000;

        while (i != 1){
            int y = i - 1;
            while (i%y!=0 && y !=1){
                y--;
            }
            if (y == 1){
                System.out.println(i);
            }
            i--;
        }


    }
}
