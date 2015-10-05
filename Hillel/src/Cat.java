/**
 * Created by RMysholovka on 05.10.2015.
 */
public class Cat {
    public static final boolean domestic = true;
    public static final boolean predator = true;

    boolean pet;
    int age;
    String name;
    String color;

   /* public Cat(){
        System.out.println("in cat's constructor");
    }*/


    public Cat(boolean ispet, int howManyage, String name, String color) {
        pet = ispet;
        age = howManyage;
        this.name = name;
        this.color = color;
    }


   /* public void init(boolean ispet, int howManyage, String name, String color){
        pet = ispet;
        age = howManyage;
        this.name = name;
        this.color = color;
    }*/


}
