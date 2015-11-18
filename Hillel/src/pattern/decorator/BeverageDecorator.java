package pattern.decorator;

/**
 * Created by MFarsikov on 12.11.2015.
 */
public abstract class BeverageDecorator extends Beverage {

    private Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + cost;
    }

    @Override
    public String description() {
        return beverage.description() + description;
    }
}
