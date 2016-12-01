
public class MyPoint implements Movable {
    int x;
    int y;
    int speedX;
    int speedY;

    public MyPoint(){

        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y){
        this.setXY(x,y);
    }

    public MyPoint(int x, int speedX, int y, int speedY){
        this.setXY(x,y);
        this.setSpeedXY(speedX, speedY);
    }

    public String toString(){
        return String.format("(%d,%d)", x, y);
    }

    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    public double distance(){
        return distance(0,0);
    }

    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    public int[] getSpeedXY() {
        int arry[] = {this.speedX, this.speedY};
        return  arry;
    }

    public void setSpeedXY(int speedX, int speedY){
        this.speedX = speedX;
        this.speedY = speedX;
    }

    public int[] getXY() {
        int arry[] = {this.x, this.y};
        return  arry;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        setY(y + speedY);
    }

    @Override
    public void moveDown() {
        setY(y - speedY);
    }

    @Override
    public void moveLeft() {
        setX(x - speedX);
    }

    @Override
    public void moveRight() {
        setX(x + speedX);
    }
}
