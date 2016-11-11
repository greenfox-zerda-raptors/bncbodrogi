import java.util.ArrayList;

public class d01ws18 {
    public static void main(String[] args) {
        String example = "A long example string";
        String replacefrom = "long";
        String replacewith = "short";


        //  exampleReplace(example, "long", "short");
        // I would like to replace "long" with "short" in this example, but it has a problem. Please fix it! Don't forget that String is immutable
        // Expected ouput: A short example string

        System.out.println(exampleReplace(example, replacefrom, replacewith));
    }

    public static StringBuilder exampleReplace(String convertible, String from, String to) {

        StringBuilder sbConvertible = new StringBuilder();
        sbConvertible.append(convertible);
        int firstIndexOfFrom = sbConvertible.indexOf(from);
        int lastIndexOfFrom = firstIndexOfFrom + from.length();
        sbConvertible.replace(firstIndexOfFrom, lastIndexOfFrom, to);
        return sbConvertible;
    }
}




