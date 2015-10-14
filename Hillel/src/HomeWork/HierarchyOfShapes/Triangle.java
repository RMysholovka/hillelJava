package HomeWork.HierarchyOfShapes;

import HomeWork.HierarchyOfColors.Paint;

/**
 * Created by ${Roman} on 14.10.2015.
 */
public class Triangle extends Shape {

    private double a;
    private double b;
    private double k; // the angle between  side a and side b of the triangle

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

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public Triangle(String nameShape, Paint color, double a, double b, double k) {
        super(nameShape, color);
        this.a = a;
        this.b = b;
        this.k =k;
    }

    @Override
    public double getSquare() {
        return a*b*Math.sin(k)/2;

    }

    @Override
    public double getPerimeter() {
        return a + b + (Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(k)));
    }
}