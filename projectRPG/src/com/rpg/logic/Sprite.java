package com.rpg.logic;

public class Sprite {
    int posX;
    int posY;

    public Sprite(){
        posX = 0;
        posY = 0;
    }


    public Sprite(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

}
