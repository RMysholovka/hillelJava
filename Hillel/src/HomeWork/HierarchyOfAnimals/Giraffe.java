package HomeWork.HierarchyOfAnimals;

/**
 * Created by ${Roman} on 10.10.2015.
 */
public class Giraffe extends Wild {
    public static final boolean isPredator = false;

    public Giraffe(int howManyweight, int howManyage,  String color, String id) {
        this.id = id;
        weight = howManyweight;
        age = howManyage;
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "Hello Iam Giraffe. I am a wild animal";
    }
}
