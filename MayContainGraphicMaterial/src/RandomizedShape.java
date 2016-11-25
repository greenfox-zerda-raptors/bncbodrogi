
import java.util.Random;

public class RandomizedShape {

    private String hexColor;
    int[] xPoints;
    int[] yPoints;
    int numberOfPoints;
    private Random randomNum;

    public RandomizedShape() {
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


    public RandomizedShape(int complexity, int possibleWidth, int possibleHeigth) {

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