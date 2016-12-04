package ws02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wrapper extends JFrame implements ActionListener {

    JMenu menu;
    JMenuBar menuBar;
    JMenuItem itemExit, itemFile;
    JPanel container;
    JLabel menuLabel, exitLabel, fileLabel, menuBarLabel;


    public Wrapper(){

        setView();

        this.setVisible(true);
        this.setResizable(false);
        this.setSize(500, 500);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int posX = (dim.width / 2) - (this.getWidth() / 2);
        int posY = (dim.height / 2) - (this.getHeight() / 2);

        this.setLocation(posX, posY);

    }

    private void setView() {
        setJMenuBar(menuBar);

        container = new JPanel();
        this.add(container);

        menuBar = new JMenuBar();
        container.add(menuBar);

        menu = new JMenu();
        menuBar.setSize(500,20);
        menuBar.add(menu);

        itemExit = new JMenuItem();
        menu.add(itemExit);

        itemFile = new JMenuItem();
        menu.add(itemFile);

        menuBarLabel = new JLabel();
        menuBarLabel.setVisible(true);
        menuBarLabel.setText("Bar");
        menuBarLabel.setSize(500,20);
        menuBar.add(menuBarLabel);

        menuLabel = new JLabel();
        menuLabel.setVisible(true);
        menuLabel.setText("Menu");
        menuLabel.setSize(20,20);
        menu.add(menuLabel);

        fileLabel = new JLabel();
        fileLabel.setVisible(true);
        fileLabel.setText("File");
        fileLabel.setSize(20,20);
        itemFile.add(fileLabel);

        exitLabel = new JLabel();
        exitLabel.setVisible(true);
        exitLabel.setText("Exit");
        exitLabel.setSize(20,20);
        itemExit.add(exitLabel);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
