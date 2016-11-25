import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainFrame extends JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();

    public  MainFrame(){

        Dimension dim = tk.getScreenSize();

        int posX = (dim.width / 2) - (this.getWidth() / 2);
        int posY = (dim.height / 2) - (this.getHeight() / 2);

        this.setLocation(posX, posY);

        JPanel bgImage = new ImagePanel();
        bgImage.setSize(800,600);
        bgImage.setLocation(posX, posY);
        bgImage.addMouseListener(
                new BackgroundImageMouseListener()
        );

        this.setTitle("TrippyHippie");
        this.setResizable(false);
        this.add(bgImage);
        this.setSize(800,600);
        this.setVisible(true);
        this.setLocationRelativeTo(null);



        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private class BackgroundImageMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            revalidate();
            repaint();
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
}
