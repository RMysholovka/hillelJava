package pattern.duck;

/**
 * Created by RMysholovka on 29.10.2015.
 */
public class Quack implements QuackBehavior {
    @Override
    public String quack() {
        return "Quack";
    }
}
