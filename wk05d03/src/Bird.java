
public class Bird extends Animal {


    public Bird (){
        super("New bird");
        carnivore = false;
        hasTail = true;
        lifeExpectancy = 2;
    }


    public void nightNight(){
        eat();
        sleep();
    }

    public void sleep() {
        System.out.println("The Birrd is sleeping");
    }

    public void eat() {
        System.out.println("The Birrd is eating");
    }

    public void speak(){
        System.out.println("CHERP");
    }

    public void fly(){
        System.out.println("Whooosssh");
    }

    public void test(){
        fly();
        super.test();
    }
}

