package PubBrawl.CharClasses;

import PubBrawl.Character;
import PubBrawl.Skilly;

public class Warrior extends Character implements Skilly{

    public Warrior(){
        super.setDexterity(super.getDexterity() + 1);
        super.setStrength(super.getStrength() + 1);
        super.setInteligence(super.getInteligence() - 2);
    }

    @Override
    public int getAttackModifier() {
        return super.getAttackModifier() + super.getStrength();
    }

    @Override
    public void attack(Character opponent) {
        System.out.println("Slash");
    }

    @Override
    public void defend() {
        System.out.println("Block");
    }
}
