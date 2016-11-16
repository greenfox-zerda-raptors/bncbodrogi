
public class Animal {

    String type;
    int lifeExpectancy;
    boolean carnivore;
    boolean hasTail;

    public Animal (){
        hasTail = true;
        lifeExpectancy = 10;
        carnivore = false;
        System.out.println("An animal has been created");
    }

    public Animal (String type){
        hasTail = true;
        lifeExpectancy = 10;
        carnivore = false;
        System.out.println(type);
    }

    public Animal (int lifeExpectancy, boolean carnivore){
        this.carnivore = carnivore;
        this.lifeExpectancy = lifeExpectancy;
        System.out.println("An animal has been created");
    }


    public String toString () {
        return "Life expectancy is " + lifeExpectancy + " years and the rumors regarding it's carnivorous nature are " + carnivore ;
    }

    public void sleep () {
        System.out.println("ZZZzzzZZZZzzzz");
    }

    public void eat () {
        System.out.println("Omnomnomnomomm");
    }

    public void speak () {
        System.out.println("Animal speaks");
    }

    public void test () {
        sleep();
        speak();
        System.out.println(toString());
    }
}
