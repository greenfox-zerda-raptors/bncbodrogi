
public class Car {
    private int engine;
    private int kmOdometer;
    private String typeCar;
    private String color;

    public Car () {
        engine = 1100;
        kmOdometer = 112300;
        typeCar = "Mazda";
        color = "red";
    }

    public Car(int engine, int kmOdometer, String typeCar, String color){
        this.engine = engine;
        this.kmOdometer = kmOdometer;
        this.typeCar = typeCar;
        this.color = color;
    }

    public Car(int engine, int kmOdometer) {
        this.engine = engine;
        this.kmOdometer = kmOdometer;
        color = "red";
        typeCar = "Mazda";
    }

    public Car(String color, String typeCar) {
        this.color = color;
        this.typeCar = typeCar;
        kmOdometer = 1600;
        engine = 10;
    }

    public Car(String color, String typeCar, int engine) {
        this.color = color;
        this.typeCar = typeCar;
        this.engine = engine;
        kmOdometer = 10000;
    }

    public String toString (){
        String introduction = "This " + typeCar + " is " + color + ", has " + engine + " cc engine and clocked: " + kmOdometer + "km-s.";
        return introduction;

    }

    public int getCount (){
        int n;

        return n;
    }

    public void drive (int distance) {
        setKmOdometer(kmOdometer + distance);
        if (distance < 20) {
            System.out.println("brrrm, " + typeCar + " just drove around town  " + distance + " clicks, the odometer now shows: " + kmOdometer);
        }else if(distance < 50) {
            System.out.println("brrrm, screech, brrm, screech; " + typeCar + " just commuted " + distance + ", the odometer now shows: " + kmOdometer);
        }else {
            System.out.println("whee, " + typeCar + " " + distance + ", the odometer now shows: " + kmOdometer);
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getEngine() {
        return engine;
    }

    public void setKmOdometer(int kmOdometer) {
        this.kmOdometer = kmOdometer;
    }

    public int getKmOdometer() {
        return kmOdometer;
    }

    public void setTypeCare(String typeCare) {
        this.typeCar = typeCare;
    }

    public String getTypeCar() {
        return typeCar;
    }
}

