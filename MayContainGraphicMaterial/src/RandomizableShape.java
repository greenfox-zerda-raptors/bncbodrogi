import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Random;

public class RandomizableShape {

    private String hexColor;
    int[] xPoints;
    int[] yPoints;
    int numberOfPoints;
    private Random randomNum;

    public RandomizableShape() {
        randomNum = new Random();
        numberOfPoints = randomNum.nextInt(20);
        xPoints = new int[numberOfPoints];
        yPoints = new int[numberOfPoints];

        for (int i = 0; i < xPoints.length; i++) {
            xPoints[i] = randomNum.nextInt(800);
        }

        for (int i = 0; i < yPoints.length; i++) {
            yPoints[i] = randomNum.nextInt(600);
        }

        hexColor = RandomHexColor.generateHexColor();

    }

    public RandomizableShape(int complexity, int possibleWidth, int possibleHeigth) {

        randomNum = new Random();
        numberOfPoints = randomNum.nextInt(complexity);
        xPoints = new int[numberOfPoints];
        yPoints = new int[numberOfPoints];

        for (int i = 0; i < xPoints.length; i++) {
            xPoints[i] = randomNum.nextInt(possibleWidth);
        }

        for (int i = 0; i < yPoints.length; i++) {
            yPoints[i] = randomNum.nextInt(possibleHeigth);
        }

        hexColor = RandomHexColor.generateHexColor();


    }
}