package pattern.duck;

/**
 * Created by RMysholovka on 26.10.2015.
 */
public class RubberDuck extends Duck {


    public RubberDuck() {
        // FlyBehavior = new FlyNoWay();
        //quackBehavior = new Quack();
    }

    @Override
    String display() {
        return "Rubber duck";
    }


}
