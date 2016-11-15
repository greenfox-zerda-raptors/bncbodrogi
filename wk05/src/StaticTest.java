
public class StaticTest {
    public static void main(String[] args) {
        Garage garage1 = new Garage();
        for (Car cars : garage1.getCars()){
            System.out.println(cars);
        }
        System.out.println(Car.getCount());
    }
}
