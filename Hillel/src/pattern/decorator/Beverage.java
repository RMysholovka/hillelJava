package pattern.decorator;

/**
 * Created by RMysholovka on 12.11.2015.
 */
public abstract class Beverage {
    protected int cost;
    private String description;


    public int cost() {

        return cost;
    }

    public String description() {
        return description;

    }

    public String setDescription(String description) {
        this.description = description;
        return description;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
