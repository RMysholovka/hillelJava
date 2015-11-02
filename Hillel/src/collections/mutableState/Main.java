package collections.mutableState;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by RMysholovka on 02.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Set<Car> dreamList = new TreeSet<>(new CarComparator());

        Car ivanDream = new Car("Audi");
        Car peterDream = new Car("Mercedes");
        Car alexDream = new Car("Porshe");

        dreamList.add(ivanDream);
        dreamList.add(peterDream);


        System.out.println(dreamList);

        //  alexDream.model = "Acura";

        dreamList.add(alexDream);

        System.out.println("ivan dream is in list: " + dreamList.contains(ivanDream));
        System.out.println("ivan dream is in list: " + dreamList.contains(peterDream));
        System.out.println("ivan dream is in list: " + dreamList.contains(alexDream));

        System.out.println(dreamList);

        dreamList.remove(alexDream);

        alexDream = new Car("Porshe");

        dreamList.add(alexDream);

        String s = "asd";

        String copy = s;
        s += "aaa";

        System.out.println(copy == s);

    }
}
