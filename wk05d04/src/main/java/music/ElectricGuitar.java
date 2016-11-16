package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    String sound;

    public ElectricGuitar (){
        super();
        sound = "Twang";
        name = "Guitar";
        numberOfStrings = 6;
    }

    public ElectricGuitar (int numberOfStrings){
        super(numberOfStrings);
        sound = "Twang";
        name = "Guitar";
    }

    public ElectricGuitar (String name, int numberOfStrings, String sound){
        super(name, numberOfStrings);
        this.sound = sound;
    }

    public void play(){
        System.out.println(String.format(formatForPlay, name, numberOfStrings,sound));
    }
}
