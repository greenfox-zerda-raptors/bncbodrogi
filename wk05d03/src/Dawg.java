
public class Dawg extends Animal{

    public Dawg (){
        super("Yo bruv guess whos not dead?");
        lifeExpectancy = 15;
        carnivore = true;
        hasTail = true;

    }

    public void speak(){
        System.out.println("Imma mess u up fam");
    }

    public void beg(){
        System.out.println("Can I borrow your lighter mate?");
    }

    public void test() {
        beg();
        super.test();
        System.out.println("has tail: " + hasTail);
    }
}
