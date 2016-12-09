package com.rpg.logic;

import java.util.ArrayList;

public class MapDimensions {

    int[] dimensionX;
    int[] dimensionY;
    int[][] map;
    ArrayList<Tile> tiles;

    public MapDimensions() {
        dimensionX = new int[11];
        dimensionY = new int[10];
        tiles = new ArrayList<>();

        for (int x = 1; x < 11; x++) {
            dimensionX[x] = dimensionX[x - 1] + 50;
        }

        for (int y = 1; y < 10; y++) {
            dimensionY[y] = dimensionY[y - 1] + 50;
        }

        map = new int[][]{
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 0, 0, 0}
        };

        for (int x = 0; x < 11; x++) {
            for (int y = 0; y < 10; y++) {
                if (map[x][y] == 0) {
                    tiles.add(new Tile("yellow", dimensionX[x], dimensionY[y]));
                } else {
                    tiles.add(new Tile("wall", dimensionX[x], dimensionY[y]));
                }
            }
        }

    }

    public int[] getDimensionX() {
        return dimensionX;
    }

    public int[] getDimensionY() {
        return dimensionY;
    }

    public int[][] getMap() {
        return map;
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    public void setMap(int x, int y, int setTo) {
        map[x][y] = setTo;
    }
}