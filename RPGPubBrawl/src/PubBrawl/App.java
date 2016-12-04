package PubBrawl;

import PubBrawl.CharClasses.*;

public class App {
    public static void main(String[] args) {
        Character sanya = new Thief();
        Character tibi = new Mage();
        System.out.println(tibi.getHP());
        sanya.attack(tibi);
        System.out.println(tibi.getHP());
    }
}
