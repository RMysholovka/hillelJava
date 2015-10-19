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

        System.out.println(" cat as animal " + sound);

        Object cat3 = new Cat();

        cat3.equals(new Object());

        Object[] objects = new Object[10];
        objects[0] = "some string";
        objects[1] = new Cat(true, 3, "Tom", "Blue- gray");
        objects[2] = System.in;

        for (Object o : objects) {

            System.out.println(o.toString());
        }
    }

    private static void referenceCmpatition() {
        Cat tomCat1 = new Cat(true, 3, "Tom", "Blue-gray");
        Cat tomCat2 = new Cat(true, 3, "Tom", "Blue-gray");

        System.out.println(tomCat1 == tomCat2);

        tomCat1 = tomCat2;

        System.out.println(tomCat1 == tomCat2);
    }

    private static void catCreation() {
        if (Cat.domestic) {
            System.out.println("OOP.OOP.Cat is domestic animal");

        }
        if (Cat.predator) {
            System.out.println("cat is predator");

        }
        Cat tomCat = new Cat(true, 3, "Tom", "Blue-gray");


        Cat murzik = new Cat(true, 4, "Black", "Mursik");



        /*OOP.OOP.Cat murzik = new OOP.OOP.Cat();
        murzik.pet = true;
        murzik.age = 4;
        murzik.color = ";
        murzik.name = "Mursik";*/

        System.out.println(tomCat);
        System.out.println(murzik);
        System.out.println(Cat.predator);
    }
}
