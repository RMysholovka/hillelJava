package HomeWork.HierarchyOfShapes;


import HomeWork.HierarchyOfColors.Paint;

/**
 * Created by ${Roman} on 14.10.2015.
 */

public abstract class Shape {

    protected String nameShape;
    protected Paint color;




    public String getNameShape() {
        return nameShape;
    }

    public void setNameShape(String nameShape) {
        this.nameShape = nameShape;
    }


    public Shape(String nameShape, Paint color) {
        this.nameShape = nameShape;
        this.color = color;
    }

    public double getQuantityColor() {

        return color.getQuantity() * getSquare();
    }


    public abstract double getSquare();

    public abstract double getPerimeter();


    public String toString() {
        return "\nShape: " + getNameShape() +
                "\nSqure: " + getSquare() +
                "\nColor: " + color.getColorName() +
                "\nQuantity: " + getQuantityColor();


    }


    protected boolean equals(Shape o) {

        if (o instanceof Shape) {
            if ((o.color.getColorName().equals(this.color.getColorName())) &&
                    (o.color.getQuantity() == this.color.getQuantity())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


}