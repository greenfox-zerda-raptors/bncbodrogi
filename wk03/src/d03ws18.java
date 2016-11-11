
public class d03ws18 {
    // write a function that sum all the numbers until the given parameter

    public static void main(String[] args) {
        int num = 101;
        System.out.println(sumUpUntil(num));
    }

    public static int sumUpUntil (int num){
        int sum =0;
        for (int i = 0; i <= num; i++){
            sum = i + sum;
        }
        return sum;
    }
}
