package pattern.duck;

/**
 * Created by RMysholovka on 26.10.2015.
 */
public class MallarDuck extends Duck {

    public MallarDuck() {
        flyBehavior = new Fly();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return "mallard duck";
    }
}

