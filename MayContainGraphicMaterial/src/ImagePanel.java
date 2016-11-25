import javax.swing.*;
import java.awt.*;
import java.awt.geom.CubicCurve2D;

public class ImagePanel extends JPanel {

    private Image image;

    public ImagePanel(){
        image = Toolkit.getDefaultToolkit().createImage("bground.png");
        this.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        requestFocus();
        graphics.drawImage(image, 0, 0, this);


        String color = RandomHexColor.generateHexColor();
        graphics.setColor(Color.decode(color));
        int xpoints[] = {25, 75, 125, 85, 125, 75, 25, 65, 25};
        int ypoints[] = {50, 90, 50, 100, 150, 110, 150, 100, 50};
        graphics.fillPolygon(xpoints, ypoints, 9);

    }
}
