package pattern.duck;

/**
 * Created by RMysholovka on 26.10.2015.
 */
public class Decoy extends Duck {


    @Override
    public String quack() {
        return super.quack();
    }

    @Override
    String display() {
        return null;
    }

    @Override
    public String swim() {
        return super.swim();
    }

    @Override
    public String fly() {
        return "fly no way";
    }

}
