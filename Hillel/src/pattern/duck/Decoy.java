package pattern.duck;

/**
 * Created by RMysholovka on 26.10.2015.
 */
public class Decoy extends Duck {

    public Decoy() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    String display() {
        return "Decoy";
    }
}
