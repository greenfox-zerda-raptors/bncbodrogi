public class squareDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(9999));
    }

    public static int squareDigits(int n) {
        String digits =  String.valueOf(n);
        StringBuilder squaredDigits = new StringBuilder();
        for(int i = 0; i < digits.length(); i++){
            int digit = Integer.parseInt(Character.toString(digits.charAt(i)));
            int squaredDigit =  digit * digit;
            squaredDigits.append(squaredDigit);
        }
        n = Integer.parseInt(squaredDigits.toString());

        return n;
    }

}