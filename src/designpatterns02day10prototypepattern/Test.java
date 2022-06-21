package designpatterns02day10prototypepattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1999k
 */
public class Test {

    public static void main(String[] args) {

        A a = new A(10, 20);

        System.out.println("a - x : " + a.x + " / a - y : " + a.y);

        try {
            A aClone = (A) a.clone();
            System.out.println("aClone - x : " + aClone.x + " / aClone - y : " + aClone.y);
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

    }

}

class A implements Cloneable {

    int x;
    int y;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
