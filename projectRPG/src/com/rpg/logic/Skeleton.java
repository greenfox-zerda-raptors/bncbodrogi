package com.rpg.logic;

import java.util.Random;

public class Skeleton extends Sprite {

    Random randomNum = new Random();

    public Skeleton(){
        posX = randomNum.nextInt(11) * 50;
        posY = randomNum.nextInt(10) * 50;
    }

    public Skeleton(int posX, int posY){
        super(posX, posY);
    }
}
