package pattern.decorator;

/**
 * Created by MFarsikov on 12.11.2015.
 */
public abstract class Beverage {

    protected int cost;

    protected String description;

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int cost() {

        return cost;
    }

    public String description() {
        return description;
    }
}
