public class duplicateEncoder_codewars {
    public static void main(String[] args) {
        System.out.println(encode("(( @"));
    }


    static String encode(String word){
        word = word.toLowerCase();
        StringBuilder encodedWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++){
            if(word.substring(i+1, word.length()).contains(Character.toString(word.charAt(i))) || word.substring(0, i).contains(Character.toString(word.charAt(i)))){
                encodedWord.append(")");
            }else{
                encodedWord.append("(");
            }
        }
        word = encodedWord.toString();

        return word;
    }
}
