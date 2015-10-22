package OOP;

import OOP.Animal;

import java.util.Comparator;

/**
 * Created by RMysholovka on 05.10.2015.
 */
public class Cat extends Animal implements Comparable<Cat> {
    public static final boolean domestic = true;
    public static final boolean predator = true;

    boolean pet;
    String color;

    public Cat() {
        super("uncnow", 5);
        System.out.println("in cat's constructor");
    }

    /**
     * Constructor description
     *
     * @param isPet coment about cat
     * @param age   test
     * @param name  test
     * @param color test
     */

    public Cat(boolean isPet, int age, String name, String color) {
        super(name, age);
        pet = isPet;

        this.color = color;
    }

    @Override
    public boolean equals(Object otherObject) {
        System.out.println("in cat's equals method");

        if (!super.equals(otherObject)) return false;

        if (!(otherObject instanceof Cat)) return false;

        Cat otherCat = (Cat) otherObject;

        if (pet != otherCat.pet) return false;
        if (!color.equals(otherCat.color)) return false;
        return true;
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += " Cat{" +
                "pet=" + pet +
                ", color='" + color + '\'' +
                '}';
        return result;
    }

    @Override
    public int compareTo(Cat o) {
        return this.getName().compareTo(o.getName());
    }

}
