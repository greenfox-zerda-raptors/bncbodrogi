package main.java.music;

public class StringedInstrument extends Instrument{
    int numberOfStrings;

    final String formatForPlay ="%s, a %d-stringed instrument that %s\n";

    public StringedInstrument(){
        numberOfStrings = 2;
    }

    public StringedInstrument(int numberOfStrings){
        super();
        this.numberOfStrings = numberOfStrings;
    }

    public StringedInstrument(String name, int numberOfStrings){
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    public void play (){
        super.play();
    }
}
