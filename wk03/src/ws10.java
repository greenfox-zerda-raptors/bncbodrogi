
public class ws10 {
    public static void main(String[] args) {
        int j1 = 10;
        int j2 = 3;

        int a = (int) Math.pow(j2, 2);
        int b = (int) Math.sqrt(j2);

        System.out.println(b < j1);
        System.out.println(j1 < a);


        System.out.println(Math.sqrt(j2) < j1);
        System.out.println(j1 < (int) Math.pow(j2, 2));

    }
}
