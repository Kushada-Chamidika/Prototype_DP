package designpatterns02day10prototypepattern;

/**
 *
 * @author 1999k
 */
public class patternTest {

    public static void main(String[] args) {

        A1 a1 = new A1(10, 20);
        System.out.println(a1.getX() + a1.getY());

        A1 a2 = a1.clone();
        System.out.println(a2.getX() + a2.getY());

    }

}

interface ProtoType {

    public abstract A1 clone();

}

class A1 implements ProtoType {

    int x;
    int y;

    public A1(int x, int y) {
        this.x = x;
        this.y = y;
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

    @Override
    public A1 clone() {
        return new A1(this.x, this.y);
    }

    @Override
    public String toString() {
        return this.x + " , " + this.y;
    }

}
