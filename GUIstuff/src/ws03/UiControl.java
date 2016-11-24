package ws03;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UiControl extends JFrame {

    private JLabel inputTxt, memory;
    private JTextField txtField;
    private String rememberMe;
    private JButton resetButton;

    public UiControl(){
        createView();

        setName("Text Box");
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int posx = (dim.width / 2) - (this.getWidth());
        int posy = (dim.height / 2) - (this.getHeight());

        setLocation(posx, posy);
        pack();
    }

    private void createView() {
        JPanel panel = new JPanel();
        LayoutManager boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);
        getContentPane().add(panel);

        inputTxt = new JLabel("Text: ");
        inputTxt.setSize(30, 20);
        inputTxt.setVisible(true);
        panel.add(inputTxt);

        memory = new JLabel("Memory: ");
        memory.setSize(30, 20);
        memory.setVisible(true);
        panel.add(memory);

        txtField = new JTextField();
        txtField.addActionListener(
                new TxtFieldActionListener()
        );
        txtField.setVisible(true);
        panel.add(txtField);

        resetButton = new JButton("Reset memory");
        resetButton.addActionListener(
                new ResetButtonActionListener()
        );
        resetButton.setVisible(true);
        panel.add(resetButton);

    }

    private class TxtFieldActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            updateInputTxt();
            updateMemory();
            txtField.setText("");
        }
    }

    public void updateMemory(){
        memory.setText("Memory: " + rememberMe.substring(5));
    }

    public void updateInputTxt(){
        rememberMe = inputTxt.getText();
        inputTxt.setText("Text: " + txtField.getText());
    }

    private class ResetButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            memory.setText("Memory: ");
        }
    }
}
