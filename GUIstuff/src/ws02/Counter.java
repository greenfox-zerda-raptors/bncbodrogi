package ws02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame{

    private int clicks = 0;
    private JButton countButton, resetButton;
    private JLabel labelCount;

    public Counter() {
        createView();

        pack();
        this.setTitle("Click me");
        this.setVisible(true);
        this.setResizable(false);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xpos = (dim.width / 2) - (this.getWidth() / 2);
        int ypos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xpos, ypos);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void createView(){

        JPanel firstPanel = new JPanel();
        getContentPane().add(firstPanel);
        countButton = new JButton();
        resetButton = new JButton();
        labelCount = new JLabel();

        resetButton.setText("Reset");
        resetButton.addActionListener(
                new ResetButtonActionListener()
        );
        countButton.setText("Count");
        countButton.addActionListener(
                new CounteButtonActionListener()
        );
        labelCount.setVisible(true);
        labelCount.setSize(100, 40);
        updateCounter();

        firstPanel.add(countButton);
        firstPanel.add(resetButton);
        firstPanel.add(labelCount);
    }

    public void updateCounter(){
        labelCount.setText("Clicked " + clicks + " times");
    }

    private class CounteButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clicks++;
            updateCounter();

        }
    }

    private class ResetButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clicks = 0;
            updateCounter();
        }
    }
}
