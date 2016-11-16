package main.java.music;

public class ElectricBass extends StringedInstrument{
    String sound;

    public ElectricBass (){
        super();
        sound = "Dum Durum Dumm";
        name = "Bass";
        numberOfStrings = 4;
    }

    public ElectricBass (int numberOfStrings){
        super(numberOfStrings);
        sound = "Dum Durum Dumm";
        name = "Bass";
    }

    public ElectricBass (String name, int numberOfStrings, String sound){
        super(name, numberOfStrings);
        this.sound = sound;
    }

    public void play(){
        System.out.println(String.format(formatForPlay, name, numberOfStrings,sound));
    }
}
