package PubBrawl;

import java.util.Random;

public class Character extends Race implements Skilly{

    int strength;
    int dexterity;
    int inteligence;
    int vitality;
    int toughness;
    int HP;
    String race;
    String taunt;
    String challangeAccepted;

    public Character(){
        strength = 5;
        dexterity = 5;
        inteligence = 5;
        vitality = 5;
        toughness = 5;
        HP = 10 * vitality;
        super.elf(this);
    }

    public int getAttackModifier(){
        Random randomNum = new Random();
        int attackModifier = randomNum.nextInt(11);
        return attackModifier;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getInteligence() {
        return inteligence;
    }

    public void setInteligence(int inteligence) {
        this.inteligence = inteligence;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getTaunt() {
        return taunt;
    }

    public void setTaunt(String taunt) {
        this.taunt = taunt;
    }

    public String getChallangeAccepted() {
        return challangeAccepted;
    }

    public void setChallangeAccepted(String challangeAccepted) {
        this.challangeAccepted = challangeAccepted;
    }

    @Override
    public void attack(Character opponent) {
        System.out.println(taunt);
        System.out.println(opponent.challangeAccepted);
        opponent.setHP(opponent.getHP() - (getAttackModifier() - opponent.getToughness()));
        if(opponent.getHP() > 0){
            opponent.defend();
        }else{
            System.out.println(opponent.getRace() + "is dead");
        }

    }

    @Override
    public void defend() {

    }
}