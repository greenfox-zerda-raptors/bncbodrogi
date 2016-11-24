package ws01;

import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventCounterExtended extends JFrame {

    int mouseActionsTaken = 0;
    int windowActionsTaken = 0;
    int keyActionsTaken = 0;
    JLabel mouseEventLabel, windowEventLabel, keyEventLabel, resetButtonLabel;

    public EventCounterExtended(){
        createView();

        this.setTitle("Counter");
        this.setVisible(true);
        this.setResizable(true);

        Toolkit tk =Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int posX = (dim.width / 2) - (this.getWidth() / 2);
        int posY = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(posX, posY);
        pack();


        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.addWindowListener(
                new windowEventListener()
        );
    }

    public void createView() {

        JPanel container = new JPanel();
        this.add(container);
        setLayout(new FlowLayout());

        JPanel mouseEvent = new JPanel();
        container.add(mouseEvent);
        container.addMouseListener(
                new mouseEventListener()
        );

        JPanel windowEvent = new JPanel();
        container.add(windowEvent);

        JPanel keyEvent = new JPanel();
        container.add(keyEvent);

        JButton resetButton = new JButton();
        resetButton.addActionListener(
                new resetButtonActionListener()
        );
        container.add(resetButton);

        JTextField textField = new JTextField(10);
        textField.addKeyListener(
                new keyEventListener()
        );

        container.add(textField);

        mouseEvent.setVisible(true);
        mouseEvent.setSize(100,40);
        mouseEventLabel = new JLabel();
        mouseEventLabel.setText("Mouse clicked: " + mouseActionsTaken);
        mouseEventLabel.setVisible(true);
        mouseEventLabel.setSize(100, 40);
        mouseEvent.add(mouseEventLabel);

        windowEvent.setVisible(true);
        windowEvent.setSize(100,40);
        windowEventLabel = new JLabel();
        windowEventLabel.setText("Window events occured: " + windowActionsTaken);
        windowEventLabel.setVisible(true);
        windowEventLabel.setSize(100, 40);
        windowEvent.add(windowEventLabel);

        keyEvent.setVisible(true);
        keyEvent.setSize(100,40);
        keyEventLabel = new JLabel();
        keyEventLabel.setText("Any key pressed: " + keyActionsTaken);
        keyEventLabel.setVisible(true);
        keyEventLabel.setSize(100, 40);
        keyEvent.add(keyEventLabel);

        resetButton.setVisible(true);
        resetButton.setSize(100,40);
        resetButtonLabel = new JLabel();
        resetButtonLabel.setText("Reset");
        resetButtonLabel.setVisible(true);
        resetButtonLabel.setSize(100,40);
        resetButton.add(resetButtonLabel);



    }

    public void updateMouseLabel(){
        mouseActionsTaken++;
        mouseEventLabel.setText("Mouse clicked: " + mouseActionsTaken);
    }

    public void updateWindowLabel(){
        windowActionsTaken++;
        windowEventLabel.setText("Window events occured: " + windowActionsTaken);
    }

    public void updateKeyLabel(){
        keyActionsTaken++;
        keyEventLabel.setText("Any key pressed: " + keyActionsTaken);
    }

    public void resetAllLabels(){
        mouseActionsTaken = 0;
        windowActionsTaken = 0;
        keyActionsTaken = 0;
        mouseEventLabel.setText("Mouse clicked: " + mouseActionsTaken);
        windowEventLabel.setText("Window events occured: " + windowActionsTaken);
        keyEventLabel.setText("Any key pressed: " + keyActionsTaken);
    }

    private class mouseEventListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            updateMouseLabel();

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    private class windowEventListener implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {
            updateWindowLabel();
        }

        @Override
        public void windowClosing(WindowEvent e) {
            updateWindowLabel();
        }

        @Override
        public void windowClosed(WindowEvent e) {
            updateWindowLabel();
        }

        @Override
        public void windowIconified(WindowEvent e) {
            updateWindowLabel();
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            updateWindowLabel();
        }

        @Override
        public void windowActivated(WindowEvent e) {
            updateWindowLabel();
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            updateWindowLabel();
        }
    }

    private class keyEventListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
            updateKeyLabel();
        }

        @Override
        public void keyPressed(KeyEvent e) {
            updateKeyLabel();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            updateKeyLabel();
        }
    }

    private class resetButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            resetAllLabels();
        }
    }
}
