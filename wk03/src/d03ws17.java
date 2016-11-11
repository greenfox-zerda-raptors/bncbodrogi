
public class d03ws17 {
    public static void main(String[] args) {

        String ag = "kuty";
        // write a function that gets a string as an input
        // and appends an 'a' character to its end
        System.out.println(append_a(ag));
    }

    public static String append_a (String whitout_a){

        String with_a = whitout_a + "a";

        return with_a;
    }

}
