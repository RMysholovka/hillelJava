package pattern.duck;

/**
 * Created by RMysholovka on 29.10.2015.
 */
public class FlyNoWay implements FlyBehavior {


    @Override
    public String fly() {
        return "No fly";
    }
}
