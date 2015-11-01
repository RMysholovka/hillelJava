package pattern.duck;

/**
 * Created by RMysholovka on 29.10.2015.
 */
public class Fly implements FlyBehavior {
    @Override
    public String fly() {
        return "I'm flying!";
    }

}
