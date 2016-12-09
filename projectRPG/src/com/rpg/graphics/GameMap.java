package com.rpg.graphics;
import com.rpg.logic.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class GameMap extends JPanel implements KeyListener {

    MapDimensions tileSet;
    Hero hero;
    Sprite boss;
    ArrayList<Skeleton> basicEnemies;

    public GameMap() {

        addKeyListener(this);
        tileSet = new MapDimensions(); //sets up the walls

        basicEnemies = new ArrayList<>();
        Random randomNum = new Random();
        int initEnemies = 0;
        while(initEnemies < randomNum.nextInt(3) + 3){
            int enemyPos = randomNum.nextInt(110);
            if (tileSet.getTiles().get(enemyPos).getType().equals("yellow")){
                basicEnemies.add(new Skeleton());
                tileSet.getTiles().get(enemyPos).setType("skeleton");
                tileSet.getTiles().get(enemyPos).initImage();
            }
            initEnemies++;
        }
        boss = new Sprite(0,0);
        int enemyPos = randomNum.nextInt(110);
        if (tileSet.getTiles().get(enemyPos).getType().equals("yellow")){
            basicEnemies.add(new Skeleton());
            tileSet.getTiles().get(enemyPos).setType("boss");
            tileSet.getTiles().get(enemyPos).initImage();
        }


        hero = new Hero(0,0);
        tileSet.getTiles().get(0).setType("hero");
        tileSet.getTiles().get(0).initImage();


        this.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        requestFocus();
        for (Tile tile : tileSet.getTiles()) {
            graphics.drawImage(tile.getImage(), tile.getPosX(), tile.getPosY(), 50, 50, this);
        }
    }

    public void addNotify() {
        super.addNotify();
        requestFocus();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int replaceIndx = 0;
        for(Tile tile : tileSet.getTiles()) {
            if (tile.getType() == "hero" || tile.getType() == "heroL" || tile.getType() == "heroR" || tile.getType() == "heroU"){
                replaceIndx = tile.getTileNumber();
            }
        }
        int key = e.getKeyCode();

            if (key == KeyEvent.VK_LEFT) {
                if(replaceIndx - 10 >= 0 && tileSet.getTiles().get(replaceIndx - 10).getType().equals("yellow")){
                    tileSet.getTiles().get(replaceIndx - 10).setType("heroL");
                    tileSet.getTiles().get(replaceIndx - 10).initImage();
                    tileSet.getTiles().get(replaceIndx).setType("yellow");
                    tileSet.getTiles().get(replaceIndx).initImage();
                }

            }

            if (key == KeyEvent.VK_RIGHT) {
                if(replaceIndx + 10 < 110 && tileSet.getTiles().get(replaceIndx + 10).getType().equals("yellow")) {
                    tileSet.getTiles().get(replaceIndx + 10).setType("heroR");
                    tileSet.getTiles().get(replaceIndx + 10).initImage();
                    tileSet.getTiles().get(replaceIndx).setType("yellow");
                    tileSet.getTiles().get(replaceIndx).initImage();
                }
            }

            if (key == KeyEvent.VK_UP) {
                if(replaceIndx - 1 >= 0 && tileSet.getTiles().get(replaceIndx - 1).getType().equals("yellow")) {
                    tileSet.getTiles().get(replaceIndx - 1).setType("heroU");
                    tileSet.getTiles().get(replaceIndx - 1).initImage();
                    tileSet.getTiles().get(replaceIndx).setType("yellow");
                    tileSet.getTiles().get(replaceIndx).initImage();
                }
            }

            if (key == KeyEvent.VK_DOWN) {
                if(replaceIndx + 1 < 110 && tileSet.getTiles().get(replaceIndx + 1).getType().equals("yellow")) {
                    tileSet.getTiles().get(replaceIndx + 1).setType("hero");
                    tileSet.getTiles().get(replaceIndx + 1).initImage();
                    tileSet.getTiles().get(replaceIndx).setType("yellow");
                    tileSet.getTiles().get(replaceIndx).initImage();
                }
            }

            if (key == KeyEvent.VK_SPACE){
                tileSet.getTiles().get(45).setType("fight1");
                tileSet.getTiles().get(45).initImage();
                tileSet.getTiles().get(55).setType("fight2");
                tileSet.getTiles().get(55).initImage();
                tileSet.getTiles().get(65).setType("fight3");
                tileSet.getTiles().get(65).initImage();
            }


        revalidate();
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
