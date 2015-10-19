package OOP;

import OOP.Animal;

/**
 * Created by RMysholovka on 05.10.2015.
 */
public class Cat extends Animal {
    public static final boolean domestic = true;
    public static final boolean predator = true;

    boolean pet;
    String color;

    public Cat() {
        System.out.println("in cat's constructor");
    }

    public Cat(boolean isPet, int age, String name, String color) {
        pet = isPet;
        this.age = age;
        this.name = name;
        this.color = color;
    }

    @Override
    public boolean equals(Object otherObject) {
        System.out.println("in cat's equals method");

        if (!(otherObject instanceof Cat)) return false;

        Cat otherCat = (Cat) otherObject;

        if (pet != otherCat.pet) return false;
        if (age != otherCat.age) return false;
        if (!name.equals(otherCat.name)) return false;
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
}
