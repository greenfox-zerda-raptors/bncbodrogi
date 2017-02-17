import java.util.ArrayList;

/**
 * Created by Bence on 2017.02.17..
 */
public class App {
    public static void main(String[] args) {


        ArrayList<Integer> oneToFive = new ArrayList<Integer>() {{
            for(int i = 1; i < 20; i++){
                add(i);
            }
        }};

        ArrayList<Integer> threeToSeven = new ArrayList<Integer>() {{
            for(int i = 4; i < 8; i++){
                add(i);
            }
        }};

        ArrayList<Integer> test = onlyInTheFirst(oneToFive, threeToSeven);

        for(int i : test){
            System.out.println(i);
        }
    }

public static ArrayList<Integer> onlyInTheFirst(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray){

        for(Integer number : secondArray){
            if(firstArray.contains(number)){
                firstArray.remove(number);
            }
        }
        return firstArray;
}

}


