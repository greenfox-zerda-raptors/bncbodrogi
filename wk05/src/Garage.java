import java.util.Random;

public class Garage {

    Car[] carsArray;

    public Garage () {
        String[][] randomPropertiesArray = {{"white", "blue", "red", "silver", "black", "green", "banana"},
                {"toyota", "mazda", "bmw", "vw", "opel", "suzuki", "ford", "mercedes"},
                {"1100", "1400", "1600", "1800", "2500"} };

        Random rnd = new Random();

        carsArray = new Car[5];
        for (int i =0; i < carsArray.length; i++) {
            carsArray[i] = new Car(randomPropertiesArray[0][rnd.nextInt(randomPropertiesArray[0].length)],
                    randomPropertiesArray[1][rnd.nextInt(randomPropertiesArray[1].length)],
                    Integer.parseInt(randomPropertiesArray[2][rnd.nextInt(randomPropertiesArray[2].length)]));
        }
    }
    public Car[] getCars(){
        return carsArray;
    }


}
