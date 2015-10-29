package pattern.duck;

/**
 * Created by RMysholovka on 26.10.2015.
 */
public class MallarDuck extends Duck {


    public MallarDuck() {

        flyBehavior = new FlyBehavior();
        quackBehavior = new QuackBehavior();
    }



    public String display() {
        return "MallarDuck";
    }
}

