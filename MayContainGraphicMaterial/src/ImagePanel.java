import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

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

        Random dimensions = new Random();

        ArrayList<RandomizedShape> AllShapesAndSizes = new ArrayList<>();

        for(int i = 0; i < (3 + dimensions.nextInt(17)); i++){
            AllShapesAndSizes.add(i, new RandomizedShape(dimensions.nextInt(100), 400 + dimensions.nextInt(400), 300 + dimensions.nextInt(300)));
        }

        for(RandomizedShape item : AllShapesAndSizes){
            graphics.setColor(Color.decode(RandomHexColor.generateHexColor()));
            graphics.fillPolygon(item.xPoints, item.yPoints, item.numberOfPoints);
        }


    }
}
