
public class ws27 {
    public static void main(String[] args) {

        String y = "seasons";
        int out = 6;
        // if the last and the first letter of the string
        // are the same double the variable
        // called out, if not half it

        int indexOfLast = y.length() - 1;
        char firstChar = y.charAt(0);
        char lastChar = y.charAt(indexOfLast);

        if (firstChar == lastChar){
            out = out * 2;
        }else{
            out = out / 2;
        }

        System.out.println(out);

    }
}
