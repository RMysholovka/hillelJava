package HomeWork.HierarchyOfShapes;

import HomeWork.HierarchyOfColors.Paint;

/**
 * Created by ${Roman} on 14.10.2015.
 */

public class Circle extends Shape {

    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(String nameShape, Paint color, double r) {
        super(nameShape, color);
        this.r = r;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.sqrt(r);

    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}