package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by user on 25.01.2016.
 */
public class StreamMain {
    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>();

        menu.add(new Dish("Borsch", 500, true, DishType.OTHER));
        menu.add(new Dish("Pork", 800, false, DishType.MEAT));
        menu.add(new Dish("Salad", 100, true, DishType.OTHER));
        menu.add(new Dish("Shark", 500, true, DishType.FISH));
        menu.add(new Dish("Burger", 900, false, DishType.OTHER));
        menu.add(new Dish("Bulba", 300, true, DishType.OTHER));
        Dish whisky = new Dish("Whisky", 0, true, DishType.OTHER);
        menu.add(whisky);
        menu.add(new Dish("Mandarin", 120, true, DishType.OTHER));

        Predicate<Dish> lowCalories = dish -> dish.getCalories() < 500;
        Stream<Dish> lowCaloriesStream = menu.stream()
                .filter(lowCalories);

        // System.out.println(lowCaloriesStream.collect(Collectors.toList()));

        menu.stream()
                .filter(lowCalories)
                .collect(toList());

        Consumer<Dish> printer = System.out::println;

        menu.stream()
                .filter(lowCalories)
                //.limit(2)
                .forEach(printer);


        long vegiCount = menu.stream()
                .filter(Dish::isVegiterian)
                .count();

        System.out.println(vegiCount + " wegies");

        System.out.println("veg and havy: ");

        Predicate<Dish> heavy = dish -> dish.getCalories() > 100;

        menu.stream()
                .filter(Dish::isVegiterian)
                .filter(heavy)
                .map(Dish::getName)
                .forEach(System.out::println);

        Predicate<Dish> meat = dish -> dish.getType() == DishType.MEAT;
        Predicate<Dish> meatAndHeavy = meat.and(heavy);

       boolean meatAndHeavyPresent =  menu.stream()
                .anyMatch(meatAndHeavy);
        System.out.println(" meat and heavy present in list: " + meatAndHeavyPresent);



        Predicate<Dish> nameIsNotNull = dish -> dish.getName() != null;

        boolean namesAreOk = menu.stream()
                .allMatch(nameIsNotNull);
        System.out.println(" name are Ok: " + nameIsNotNull);


        Predicate<Dish> isNotMeat = meat.negate();


        Predicate<Dish> isHealthy = isNotMeat.and(lowCalories);

       Optional<Dish> firstDish =  menu.stream()
                .filter(isHealthy)
                .findFirst();

        if(firstDish.isPresent()) {
            System.out.println("Healthy dish is: " + firstDish.get().getName());
        } else {
            System.out.println("There is no healthy : (");

        }

        System.out.println("healthy dish is:" + firstDish.orElse(whisky));

        System.out.println("healthy dish is: " +firstDish.orElseGet(Dish::new));

        Optional<String> reduced = menu.parallelStream()
                .map(Dish::getName)
                .reduce((accumulator, dishName) -> accumulator + ", " + dishName);

        System.out.println(reduced.get());


    }
}
