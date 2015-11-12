package pattern.decorator;

/**
 * Created by RMysholovka on 12.11.2015.
 */
public class Cream extends BeverageDecorator {
    public Cream(Beverage beverage) {
        super(beverage);
        setCost(5);
        setDescription("Cream");
    }
}
