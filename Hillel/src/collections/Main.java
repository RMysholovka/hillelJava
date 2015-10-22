package collections;

import OOP.Cat;
import OOP.Kitten;

import java.util.*;

/**
 * Created by RMysholovka on 22.10.2015.
 */
public class Main {
    public static void main(String[] args) {

        Collection<Cat> cats = new ArrayList<>();
        // List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(false, 10, "tom", "black"));

        someMethod(cats);

        //System.out.println(cats.get(0));

        Set<Cat> catSet = new TreeSet<>();
        catSet.add(new Cat(false, 10, "tom", "black"));
        catSet.add(new Cat(false, 10, "tom", "black"));
        catSet.add(new Cat(false, 10, "tom", "black"));

    }

    private static void someMethod(Collection<Cat> cats) {

        cats.forEach(System.out::println);

    }


    private static void genericAndCollections() {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat(false, 10, "tom", "black"));
        // cats.add(10);
        cats.add(new Kitten(false, 10, "tom", "black"));

        Cat cat = cats.get(0);

        // Kitten kitten = cats.get(1);
        Object o = cats.get(1);
    }

    private static void rawList() {
        ArrayList list = new ArrayList();
        list.add(new Cat(false, 10, "tom", "black"));
        list.add(10);
        list.add("world");


        for (Object o : list) {
            System.out.println(o);
        }

        //list.forEach(System.out::println);

        Cat cat = (Cat) list.get(0);

        Integer i = (Integer) list.get(1);
    }

}
