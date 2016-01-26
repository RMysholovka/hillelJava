package java8features;

/**
 * Created by user on 25.01.2016.
 */
public class Dish {
    private String name;
    private int calories;
    private boolean vegiterian;
    private DishType type;


    public Dish(){
        this ("frightend potato", 400, true, DishType.OTHER);
        System.out.println("in defoult Dish Canstractor");
    }

    public Dish(String name, int calories, boolean vegiterian, DishType type) {
        this.name = name;
        this.calories = calories;
        this.vegiterian = vegiterian;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        System.out.println("getCalories called");
        return calories;
    }

    public boolean isVegiterian() {
        return vegiterian;
    }

    public DishType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setVegiterian(boolean vegiterian) {
        this.vegiterian = vegiterian;
    }

    public void setType(DishType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", vegiterian=" + vegiterian +
                ", type=" + type +
                '}';
    }
}
