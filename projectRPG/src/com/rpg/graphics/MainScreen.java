package com.rpg.graphics;

import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame {
    GameMap tileset;

    public MainScreen() {
        tileset = new GameMap();
        this.add(tileset);
        this.setVisible(true);
        this.setSize(555, 530);
        this.setResizable(false);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xpos = (dim.width / 2) - (this.getWidth() / 2);
        int ypos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xpos, ypos);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

