package PubBrawl.CharClasses;

import PubBrawl.Character;
import PubBrawl.Race;
import PubBrawl.Skilly;

public class Mage extends Character implements Skilly{

    public Mage(){
        super.setInteligence(super.getInteligence() + 2);
        super.setStrength(super.getStrength() - 2);
    }

    @Override
    public int getAttackModifier() {
        return super.getAttackModifier() + super.getInteligence();
    }

    @Override
    public void attack(Character opponent) {
        System.out.println("Thunderbolt");
    }

    @Override
    public void defend() {
        System.out.println("Force field");
    }
}
