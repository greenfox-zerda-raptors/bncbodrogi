import javax.swing.*;
import java.awt.*;

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

        this.setTitle("TrippyHippie");
        this.setResizable(false);
        this.add(bgImage);
        this.setSize(800,600);
        this.setVisible(true);
        this.setLocationRelativeTo(null);



        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
