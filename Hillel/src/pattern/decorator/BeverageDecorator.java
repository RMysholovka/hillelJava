package pattern.decorator;

/**
<<<<<<< HEAD
 * Created by MFarsikov on 12.11.2015.
=======
 * Created by RMysholovka on 12.11.2015.
>>>>>>> origin/master
 */
public abstract class BeverageDecorator extends Beverage {

    private Beverage beverage;

<<<<<<< HEAD
=======

>>>>>>> origin/master
    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

<<<<<<< HEAD
    @Override
    public int cost() {
        return beverage.cost() + cost;
    }

    @Override
    public String description() {
=======

    @Override
    public int cost() {
        return beverage.cost() + cost();
    }

    @Override
    public String setDescription(String description) {
>>>>>>> origin/master
        return beverage.description() + description;
    }
}
