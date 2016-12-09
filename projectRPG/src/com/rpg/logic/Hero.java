package com.rpg.logic;


public class Hero {
    int posX;
    int posY;

    public Hero(int posX, int posY){
        this.posX = posX * 50;
        this.posY = posY * 50;

    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX * 50;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY * 50;
    }

    public void setPos(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }



}
