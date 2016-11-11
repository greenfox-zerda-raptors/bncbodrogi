
public class d01ws19 {
    public static void main(String[] args) {

        String name = " World";
        StringBuilder builder = new StringBuilder("Heljo");

        // Please change "Heljo" to "Hello" and add name ("World") to the end of the string builder

        System.out.println(exampleAddReplace(builder, name, "j", "l"));
    }

    public static StringBuilder exampleAddReplace(StringBuilder builder, String add, String replaceble, String replacement) {

        StringBuilder sbadd = new StringBuilder();
        builder.append(add);
        int IndexOfReplaceable = builder.indexOf(replaceble);
        builder.replace(IndexOfReplaceable, IndexOfReplaceable+1, replacement);
        return builder;
    }

}
