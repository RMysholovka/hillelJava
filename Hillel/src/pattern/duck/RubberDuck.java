package pattern.duck;

/**
 * Created by RMysholovka on 26.10.2015.
 */
public class RubberDuck extends Duck {


    @Override
    public String quack() {
        return super.quack();
    }

    @Override
    String display() {
        return "Rubber duck";
    }

    @Override
    public String fly() {
        return "fly no way";
    }
}
