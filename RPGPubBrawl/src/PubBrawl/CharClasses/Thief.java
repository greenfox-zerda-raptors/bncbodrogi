package PubBrawl.CharClasses;

import PubBrawl.Character;
import PubBrawl.Skilly;

public class Thief extends Character implements Skilly{

    public Thief(){
        super.setDexterity(super.getDexterity() + 2);
        super.setStrength(super.getStrength() - 2);
    }

    @Override
    public int getAttackModifier() {
        return super.getAttackModifier() + super.getDexterity();
    }

    @Override
    public void attack(Character opponent) {
        System.out.println("Back stab");
        super.attack(opponent);
    }

    @Override
    public void defend() {
        System.out.println("Dodge");
    }
}
