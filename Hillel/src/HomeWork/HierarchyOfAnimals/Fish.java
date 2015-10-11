package HomeWork.HierarchyOfAnimals;

/**
 * Created by ${Roman} on 10.10.2015.
 */
public class Fish extends Domestic {
    public Fish(double howManyweight, int howManyage, String name, String color, String id, boolean isVaccinated) {
        this.id = id;
        weight = howManyweight;
        age = howManyage;
        this.name = name;
        this.color = color;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public String makeSound() {
        return " ....... ";
    }
}