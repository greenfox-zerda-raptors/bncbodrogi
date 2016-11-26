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
            }else{
                conversionAssistant.append((char) (87 + element) );
            }
        }
        hexColor = conversionAssistant.toString();

        return hexColor;
    }
}
