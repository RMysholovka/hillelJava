package java8features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * Created by user on 14.01.2016.
 */
public class Java8Main {
    public static void main(String[] args) {
        streamExample();

    }

    private static void functionExample() {
        List<Apple> apples = createApples(10, (Supplier<Apple>) Apple::new);

        consumeApples(apples, new Consumer<Apple>() {
            @Override
            public void accept(Apple apple) {
                System.out.println(apple);
            }
        });


        consumeApples(apples, System.out::print);

        System.out.println(mapToString(apples, Apple::getColor));
    }

    public static List<String> mapToString(List<Apple> apples, Function<Apple, String> mapper) {
        List<String> strings = new ArrayList<>();
        for (Apple apple : apples) {
            strings.add(mapper.apply(apple));
        }
        return strings;
    }

    public static void consumeApples(List<Apple> apples, Consumer<Apple> consumer) {
        for (Apple apple : apples) {
            consumer.accept(apple);
        }
    }


    private static void streamExample() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("Red", 150));
        apples.add(new Apple("Green", 180));
        apples.add(new Apple("Yellow", 155));
        apples.add(new Apple("Red", 200));

       /* Filtrator redFilter = new RedFilter();
        List<Apple> redApples = filter(apples, redFilter);*/

        /*List<Apple> redAndHeavyApples = filter(redApples, new Filtrator() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 170;
            }
        });*/

        List<Apple> heavyApples = filter(apples, Java8Main::isHeavy);

        heavyApples = filter(apples, apple -> apple.getWeight() > 170);

        Predicate<Apple> isHeavy = Java8Main::isHeavy;

        Predicate<Apple> isGreen = apple -> apple.getColor().equals("Green");

        Predicate<Apple> isHeavyAndGreen = isGreen.and(isHeavy);

        heavyApples = apples.stream()
                .filter(isHeavyAndGreen)
                .collect(Collectors.toList());


        List<String> colors = apples.stream()
               // .filter(isHeavyAndGreen)
                .map(Apple::getColor)
              //  .limit(2)
                .distinct()//убирает дубликаты
                .sorted()// сортирует
                .collect(Collectors.toList());
        System.out.println(colors);


    }


    public static List<Apple> createApples(int count, Supplier<Apple> appleSupplier) {
        List<Apple> apples = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            apples.add(appleSupplier.get());
        }
        return apples;
    }

    public static List<Apple> createApples(int count, BiFunction<String, Integer, Apple> appleSupplier) {
        List<Apple> apples = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            apples.add(appleSupplier.apply("Red", 50));
        }
        return apples;
    }

    private static boolean isHeavy(Apple apple) {
        return apple.getWeight() > 170;
    }

    private static List<Apple> filter(List<Apple> apples, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    private static void defaultMethodExample() {
        Fruit fruit = new Apple();

        System.out.println(fruit.chop());

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(5);
        integers.add(6);
        integers.add(4);

        Collections.sort(integers);

        integers.sort(Java8Main::sortIntsAsc);

        integers.sort((o1, o2) -> o1.compareTo(o2));

        List<Integer> ints = Collections.emptyList();


        System.out.println(integers);
    }

    public static int sortIntsAsc(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}


