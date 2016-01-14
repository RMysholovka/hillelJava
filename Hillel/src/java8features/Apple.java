package java8features;

/**
 * Created by user on 14.01.2016.
 */
public class Apple implements Fruit {

    private String color;

    private int weight;

    public Apple() {
    }

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return "Apple";
    }

    @Override
    public String chop() {
        return "Chopped apple";
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
