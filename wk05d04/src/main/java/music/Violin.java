package main.java.music;

public class Violin extends StringedInstrument {
    String sound;

    public Violin (){
        super();
        sound = "Screetch";
        name = "Violin";
        numberOfStrings = 4;
    }


    public Violin (String name, int numberOfStrings, String sound){
        super(name, numberOfStrings);
        this.sound = sound;
    }

    public void play(){
        System.out.println(String.format(formatForPlay, name, numberOfStrings,sound));
    }
}
