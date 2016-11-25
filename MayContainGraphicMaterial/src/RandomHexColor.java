import java.util.Random;

public class RandomHexColor {

    private static String hexColor = new String();
    private static Random randomElement = new Random();
    private static int[] elementBlock =  new int[6];




    public static String generateHexColor(){

        StringBuilder conversionAssistant = new StringBuilder();
        conversionAssistant.append("#");

        for (int i = 0; i < 6; i++){
             elementBlock[i] = randomElement.nextInt(16);
        }
        for(int element : elementBlock){
            if(element < 10){
                conversionAssistant.append(String.valueOf(element));
            }else if(element == 10){
                conversionAssistant.append(String.valueOf("a"));
            }else if(element == 11) {
                conversionAssistant.append(String.valueOf("b"));
            }else if(element == 12) {
                conversionAssistant.append(String.valueOf("c"));
            }else if(element == 13) {
                conversionAssistant.append(String.valueOf("d"));
            }else if(element == 14) {
                conversionAssistant.append(String.valueOf("e"));
            }else if(element == 15) {
                conversionAssistant.append(String.valueOf("f"));
            }
        }
        hexColor = conversionAssistant.toString();

        return hexColor;
    }
}
