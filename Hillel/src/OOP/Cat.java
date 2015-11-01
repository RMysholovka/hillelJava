package OOP;


/**
 * Created by RMysholovka on 05.10.2015.
 */
public class Cat extends Animal implements Comparable<Cat> {

    public static final boolean domestic = true;
    public static final boolean predator = true;

    public String someField = "cat's field";
    boolean pet;
    String color;

    /**
     * creates a new instance of Cat
     */
    public Cat() {
        super("unknown", 0);
        System.out.println("in cat's constructor");
    }

    /**
     * Constructor description
     *
     * @param isPet comment about pet
     * @param age   how much years
     * @param name  name of cat
     * @param color some color
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

    public String getSomeField() {
        return someField;
    }

    public static String getTypeName() {
        return "Cat";
    }


    @Override
    public int compareTo(Cat o) {
        if (this.equals(o)) {
            return 0;
        }
        return this.getName().compareTo(o.getName());
    }
}
