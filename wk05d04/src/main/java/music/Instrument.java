package main.java.music;

abstract class Instrument {
    String name;

    void play(){
        System.out.println(name + " is being played and the room is on fire");
    }

    public Instrument (String name){
        this.name = name;
    }

    public Instrument (){
        name = "unknownInstrument";
    }
}
