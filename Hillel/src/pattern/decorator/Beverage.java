package pattern.decorator;

/**
 * Created by RMysholovka on 12.11.2015.
 */
public abstract class Beverage {
    private final int cost;
    private String description;

    private int milkCost = 5;
    private int creamCost = 8;
    private boolean hasMilk;
    private boolean hasCream;

    public Beverage(int cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public int cost() {
        int total = cost;
        if (hasMilk) {
            total += milkCost;

        }
        if (hasCream) {
            total += creamCost;

        }
        return cost;
    }

    public String description() {
        return description;

    }

    public void setCream(boolean hasCream) {
        this.hasCream = hasCream;

    }

    public void setMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }
}
