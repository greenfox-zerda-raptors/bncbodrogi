import java.util.Random;

public class Workshop01Array {
    public static void main(String[] args) {
        String[][] randomPropertiesArray = {{"white", "blue", "red", "silver", "black", "green", "banana"},
                {"toyota", "mazda", "bmw", "vw", "opel", "suzuki", "ford", "mercedes"},
                {"1100", "1400", "1600", "1800", "2500"} };
        for (String[] outer : randomPropertiesArray) {
            for (String inner : outer){
                System.out.print(inner);
                System.out.print(" ");
            }
            System.out.println();
        }

        Random rnd = new Random();

        Car[] carsArray = new Car[10];
        for (int i =0; i < carsArray.length; i++) {
            carsArray[i] = new Car(randomPropertiesArray[0][rnd.nextInt(randomPropertiesArray[0].length)],
                    randomPropertiesArray[1][rnd.nextInt(randomPropertiesArray[1].length)],
                    Integer.parseInt(randomPropertiesArray[2][rnd.nextInt(randomPropertiesArray[2].length)]));
        }

        for (int i = 0; i < 2; i++){
            carsArray[i].drive(35);
            System.out.println(carsArray[i].toString());
        }

        for (Car randomCar : carsArray){
            System.out.println(randomCar);
        }

        }
}
