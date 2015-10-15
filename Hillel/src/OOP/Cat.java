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

   /* public OOP.OOP.Cat(){
        System.out.println("in cat's constructor");
    }*/


    public Cat(boolean ispet, int howManyage, String name, String color) {
        pet = ispet;
        age = howManyage;
        this.name = name;
        this.color = color;
    }

    public Cat() {

    }


    /* public void init(boolean ispet, int howManyage, String name, String color){
         pet = ispet;
         age = howManyage;
         this.name = name;
         this.color = color;
     }*/
    @Override
    public boolean equals(Object otherObject) {
        System.out.println(" in cat equils method ");

        if (!(otherObject instanceof Cat)) return false; // специальная команда
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
        /*return "Cat{" +
                "pet=" + pet +
                ", color='" + color + '\'' +
                '}';*/
        return result;
    }
}
