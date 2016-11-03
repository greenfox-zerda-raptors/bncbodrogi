
public class ws29 {
    public static void main(String[] args) {
        int ab = 123;
        int credits = 49;
        Boolean is_bonus = false;
        // if credits are at least 50,
        // and is_bonus is False decrement ab by 2
        // if credits are smaller than 50,
        // and is_bonus is False decrement ab by 1
        // if is_bonus is True ab should remain the same

        if (is_bonus == true){
            System.out.println(ab);
        }else if(credits >= 50) {
            System.out.println(ab - 2);
        }else{
            System.out.println(ab - 1);
        }
    }
}
