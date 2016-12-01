
public class MyCircle implements Movable {

    MyPoint center = new MyPoint();
    int radius = 1;


    public MyCircle(){
    }

    public MyCircle(int x, int y, int radius){
        center.setXY(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint myPoint, int radius){
        center = myPoint;
        this.radius = radius;
    }

    public String toString(){
        return String.format("MyCircle[radius = %d, center = %s]",radius, center.toString());
    }

    public double distance(MyCircle another){
        int xDiff = this.getCenterX() - another.getCenterX();
        int yDiff = this.getCenterY() - another.getCenterY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double getArea(){
        return Math.pow((double) radius, 2) * Math.PI;
    }

    public double getCircumference(){
        return 2 * radius * Math.PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getCenterX() {
        return center.x;
    }

    public int getCenterY() {
        return center.y;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setCenterX(int x) {
        center.x = x;
    }

    public void setCenterY(int y) {
        center.y = y;
    }

    public int[] getXY() {
        int arry[] = {center.x, center.y};
        return  arry;
    }

    public void setXY(int x, int y){
        center.x = x;
        center.y = y;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
