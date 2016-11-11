
public class d03ws19 {
// create a function that returns it's input factorial

    public static void main(String[] args) {
        long num = 14;
        System.out.println(factor(num));
    }

    public static long factor (long num){
        long sum =1;
        for (int i = 1; i <= num; i++){
            sum = i * sum;
        }
        return sum;
    }
}
