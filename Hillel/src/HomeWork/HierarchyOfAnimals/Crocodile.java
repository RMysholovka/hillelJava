package HomeWork.HierarchyOfAnimals;

/**
 * Created by ${Roman} on 10.10.2015.
 */
public class Crocodile extends Animals {
    public static final boolean isPredator = true;

    public Crocodile(int howManyweight, int howManyage, String color, String id) {
        this.id = id;
        weight = howManyweight;
        age = howManyage;
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "Hello I am Crocodile. I am a wild animal and I am angry";
    }
}
