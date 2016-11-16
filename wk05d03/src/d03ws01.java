
public class d03ws01 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dawg dog = new Dawg();
        System.out.println();

        System.out.println("Testing Animal");
        // how does it speak, sleep, and tell me about its lifeExpectancy and if its a carnivore
        animal.test();

        System.out.println("\nTesting Bird");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore
        bird.test();

        System.out.println("\nTesting Dog");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?
        dog.test();


        System.out.println("\nTesting Dog2");
        Animal dog2 = new Dawg();
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?
        if (dog2 instanceof Animal){
            System.out.println("is instance of Animal");
            dog2.test();
        }

        System.out.println("\nTesting Dog 'd'");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?
        Animal d = new Dawg();
        if (d instanceof Dawg) {
            System.out.println("is instance of Dawg");
            d.test();
        }
    }
}
