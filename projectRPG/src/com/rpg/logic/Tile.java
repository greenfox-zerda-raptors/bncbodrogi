package com.rpg.logic;

import java.awt.*;

public class Tile {
    int posX;
    int posY;
    int tileNumber;
    static int counter = 0;
    String type;
    Image image;
    boolean walkable;

    public  Tile (String type, int posX, int posY){
        tileNumber = counter;
        counter++;
        this.type = type;
        this.posX = posX;
        this.posY = posY;
        initImage();
        if(getImage().equals("yellow")){
            walkable = true;
        }else{
            walkable = false;
        }

    }

    public boolean isWalkable() {
        return walkable;
    }

    public int getTileNumber() {
        return tileNumber;
    }

    public void setTileNumber(int tileNumber) {
        this.tileNumber = tileNumber;
    }

    public void setWalkable(boolean walkable) {
        this.walkable = walkable;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Image getImage() {
        return image;
    }

    public void initImage(){
        if(type == "yellow"){
            image = Toolkit.getDefaultToolkit().createImage("floor.png");
        }else if(type == "wall"){
            image = Toolkit.getDefaultToolkit().createImage("wall.png");
        }else if(type == "hero"){
            image = Toolkit.getDefaultToolkit().createImage("heroDown.png");
        }else if(type == "heroU"){
            image = Toolkit.getDefaultToolkit().createImage("heroUp.png");
        }else if(type == "heroL"){
            image = Toolkit.getDefaultToolkit().createImage("heroLeft.png");
        }else if(type == "heroR"){
            image = Toolkit.getDefaultToolkit().createImage("heroRight.png");
        }else if(type == "skeleton"){
            image = Toolkit.getDefaultToolkit().createImage("skeleton.png");
        }else if(type == "boss") {
            image = Toolkit.getDefaultToolkit().createImage("boss.png");
        }else if(type == "fight1") {
            image = Toolkit.getDefaultToolkit().createImage("fight1.jpg");
        }else if(type == "fight2") {
            image = Toolkit.getDefaultToolkit().createImage("fight2.jpg");
        }else if(type == "fight3") {
            image = Toolkit.getDefaultToolkit().createImage("fight3.jpg");
        }
    }
}

