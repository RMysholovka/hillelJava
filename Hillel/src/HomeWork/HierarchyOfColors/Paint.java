package HomeWork.HierarchyOfColors;

/**
 * Created by ${Roman} on 14.10.2015.
 */

public abstract class Paint {
    protected String colorName;
    protected double quantity;


    public Paint(String colorName, double quantity) {
        this.colorName = colorName;
        this.quantity = quantity;

    }

    public Paint() {
    }


    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }


}
