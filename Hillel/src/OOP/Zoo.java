package OOP;

import java.util.Objects;

/**
 * Created by RMysholovka on 05.10.2015.
 */
public class Zoo {
    public static void main(String[] args) {
        Cat tomCat1 = new Cat(true, 3, "Tom", "Blue-gray");

        String sound = tomCat1.makeSound();
        System.out.println(sound);

        // Animal animal = new Animal();

        Cat cat = new Cat();

        Animal animalCat = new Cat();

        sound = animalCat.makeSound();

        System.out.println("cat as animal " + sound);


        Object cat1 = new Cat(true, 3, "Tom", "Blue-gray");
        Object cat2 = new Cat(true, 3, "Tom", "Blue-gray");

        System.out.println("polymorphic equals: " + cat1.equals(cat2));


        polymorphismExample();

        Animal someAnimal = new Cat();
        someAnimal.makeSound();

    }

    private static void polymorphismExample() {
        Object[] objects = new Object[10];

        objects[0] = "some string";
        objects[1] = new Cat(true, 3, "Tom", "Blue-gray");
        objects[2] = System.in;

        for (Object o : objects) {
            System.out.println(o.toString());
        }
    }

    private static void equalsExample() {
        Cat tomCat1 = new Cat(true, 3, "Tom", "Blue-gray");
        Cat tomCat2 = new Cat(true, 3, "Tom", "Blue-gray");

        System.out.println(tomCat1.equals(tomCat2));
    }

    private static void referenceComparison() {
        Cat tomCat1 = new Cat(true, 3, "Tom", "Blue-gray");
        Cat tomCat2 = new Cat(true, 3, "Tom", "Blue-gray");

        System.out.println(tomCat1 == tomCat2);

        tomCat2 = tomCat1;

        System.out.println(tomCat1 == tomCat2);
    }

    private static void catCreation() {
        if (Cat.domestic) {
            System.out.println("cat is domestic animal");
        }
        if (Cat.predator) {
            System.out.println("cat is predator");
        }

        Cat tomCat = new Cat(true, 3, "Tom", "Blue-gray");


        Cat mursik = new Cat(true, 4, "Mursik", "Black");

        Cat cat = new Cat();

        System.out.println("cat's name " + cat.name);
        System.out.println("cat is pet " + cat.pet);


        System.out.println(tomCat.name);
        System.out.println(mursik.age);
        System.out.println(mursik.predator);
    }
}

