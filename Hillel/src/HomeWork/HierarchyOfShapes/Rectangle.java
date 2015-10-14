package HomeWork.HierarchyOfShapes;

import HomeWork.HierarchyOfColors.GreenPaint;
import HomeWork.HierarchyOfColors.Paint;

/**
 * Created by ${Roman} on 14.10.2015.
 */
public class Rectangle extends Shape {
    private double a;
    private double b;


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle(String nameShape, Paint colour, double a, double b) {
        super(nameShape, colour);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSquare() {
        return a*b;

    }

    @Override
    public double getPerimeter() {
        return 2*a + 2*b;
    }

}
