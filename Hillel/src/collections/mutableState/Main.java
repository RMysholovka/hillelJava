package collections.mutableState;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by RMysholovka on 02.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Set<Car> dreamList = new TreeSet<>(new CarComparator());

        Car ivanDream = new Car("Audi", 2010);
        Car peterDream = new Car("Mercedes", 2012);
        Car alexDream = new Car("Porshe", 2015);

        dreamList.add(ivanDream);
        dreamList.add(peterDream);


        System.out.println(dreamList);

        //  alexDream.model = "Acura";

        dreamList.add(alexDream);

        System.out.println("ivan dream is in list: " + dreamList.contains(ivanDream));
        System.out.println("peter dream is in list: " + dreamList.contains(peterDream));
        System.out.println("alex dream is in list: " + dreamList.contains(alexDream));

        System.out.println(dreamList);

        dreamList.remove(alexDream);

        alexDream = new Car("Porshe", 2015);

        dreamList.add(alexDream);

        String s = "asd";

        String copy = s;
        s += "aaa";

        System.out.println(copy == s);

        Set<Car> hashedCars = new HashSet<>();
        hashedCars.add(alexDream);
        hashedCars.add(peterDream);
        hashedCars.add(ivanDream);

        Car seekedCar = new Car("Porshe", 2015);
        System.out.println("hashcode is : " + seekedCar.hashCode());
        System.out.println("hashSet contains porshe: " + hashedCars.contains(new Car("Porshe", 2015)));

    }
}
