package HomeWork.HierarchyOfAnimals;

/**
 * Created by ${Roman} on 10.10.2015.
 */
public class GuideDog extends Domestic {
    boolean isTrained;

    public GuideDog(int howManyweight, int howManyage, String name, String color, String id, boolean isVaccinated,boolean isTrained) {
        this.id = id;
        weight = howManyweight;
        age = howManyage;
        this.name = name;
        this.color = color;
        this.isVaccinated = isVaccinated;
        this.isTrained = isTrained;
    }

    @Override
    public String makeSound() {
        return "Hello I am GuideDog. My name is: "  + name + " Woof "+" I can take you home.";
    }


    public String bringHome() {
        return "Yes, my owner, follow me";
    }

}
