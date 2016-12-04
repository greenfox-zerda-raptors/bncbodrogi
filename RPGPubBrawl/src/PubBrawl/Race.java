package PubBrawl;


public abstract class Race {

    public void elf(Character character){
        character.setDexterity(character.getDexterity() + 1);
        character.setInteligence(character.getInteligence() + 1);
        character.setStrength(character.getStrength() - 2);
        character.setRace("Elf");
        character.setTaunt("How very distasteful appearance...");
        character.setChallangeAccepted("I might as well teach you a lesson");
    }

    void human(Character character){
        character.setRace("Human");
        character.setTaunt("I bet I can drink this beer with my right while beat the shit out of you matey");
        character.setChallangeAccepted("Ladies, watch this!");
    }

    void orc(Character character){
        character.setInteligence(character.getInteligence() - 2);
        character.setStrength(character.getStrength() + 1);
        character.setVitality(character.getVitality() + 1);
        character.setRace("Orc");
        character.setTaunt("watchu luukin' at? never seen a green fella before?");
        character.setChallangeAccepted("u wot mate? I bash yo head in!");
    }
}
