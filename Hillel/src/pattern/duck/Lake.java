package pattern.duck;

/**
 * Created by RMysholovka on 26.10.2015.
 */
public class Lake {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        System.out.println(duck.quack());
        System.out.println(duck.fly());
        System.out.println(duck.display());
    }
}
