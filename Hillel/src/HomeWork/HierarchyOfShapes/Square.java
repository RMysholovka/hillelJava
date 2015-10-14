package HomeWork.HierarchyOfShapes;

import HomeWork.HierarchyOfColors.Paint;

/**
 * Created by ${Roman} on 14.10.2015.
 */
public class Square extends Shape {

    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Square(String nameShape, Paint color, double a) {
        super(nameShape, color);
        this.a = a;
    }

    @Override
    public double getSquare() {
        return Math.pow(a, 2);

    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }
}