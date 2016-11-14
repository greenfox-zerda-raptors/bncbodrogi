
public class Workshop01 {

        public static void main(String[] args){
            Car myCar = new Car();
            myCar.setKmOdometer(12312);
            myCar.setTypeCare("Mazda");
            System.out.printf("Just got a new Car, it's a %s %s it's clocked %d and has a %d cc Engine!\n",
                    myCar.getColor(), myCar.getTypeCar(), myCar.getKmOdometer(), myCar.getEngine() // replace this stuff with the way we get those attributes about myCar
            );

            Car myCar2 = new Car();
            myCar2.setEngine(2500);
            myCar2.setColor("silver");
            myCar2.setKmOdometer(15231);
            myCar2.setTypeCare("Ford");
            System.out.printf("Just got a new Car, it's a %s %s it's clocked %d and has a %d cc Engine!\n",
                    myCar2.getColor(), myCar2.getTypeCar(), myCar2.getKmOdometer(), myCar2.getEngine() // replace this stuff with the way we get those attributes about myCar
            );

            Car myCar3 = new Car();
            myCar3.setEngine(800);
            myCar3.setColor("green");
            myCar3.setKmOdometer(42521);
            myCar3.setTypeCare("Beamer");
            System.out.printf("Just got a new Car, it's a %s %s it's clocked %d and has a %d cc Engine!\n",
                    myCar3.getColor(), myCar3.getTypeCar(), myCar3.getKmOdometer(), myCar3.getEngine() // replace this stuff with the way we get those attributes about myCar
            );
            myCar2.drive(1200);

            System.out.println(myCar3.toString());

            Car myCar5 = new Car(25, 1400, "Opel", "white");
            Car myCar6 = new Car("grey", "VW");
            Car myCar7 = new Car(1100, 15);

            System.out.println((myCar5.toString()));
            System.out.println((myCar6.toString()));
            System.out.println((myCar7.toString()));
        }
}



