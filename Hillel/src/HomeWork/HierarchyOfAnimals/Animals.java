package HomeWork.HierarchyOfAnimals;

/**
 * Created by ${Roman} on 10.10.2015.
 */
public class Animals {
    String id;
    int age;
    double weight;
    String color;


    public static void main(String[] args) {

        Cat tomCat1 = new Cat(3, 5, "Tom", "Blue-gray", "45FFT", true);
        String sound = tomCat1.makeSound();

        System.out.println(sound);

        Dog rexDog1 = new Dog(26, 5, "Rex", "White", "34FRT", true);
        sound = rexDog1.makeSound();

        System.out.println(sound);

        Lion nLion1 = new Lion(110, 10, "Yellow", "39KRT");
        sound = nLion1.makeSound();

        System.out.println(sound);

        Crocodile nCrocodile1 = new Crocodile(250, 15, "Green", "56KRT");
        sound = nCrocodile1.makeSound();

        System.out.println(sound);

        Giraffe nGiraffe1 = new Giraffe(500, 16, "Yellow", "57SRT");
        sound = nGiraffe1.makeSound();

        System.out.println(sound);

        Wolf nWolf1 = new Wolf(70, 9, "Grey", "41KRT");
        sound = nWolf1.makeSound();

        System.out.println(sound);

        GuideDog nGuideDog1 = new GuideDog(15, 6, "Tuzik", "Black", "57RRT", true, true);
        sound = nGuideDog1.makeSound() + nGuideDog1.bringHome();


        System.out.println(sound);

        Fish nFish1 = new Fish(0.1, 2, "GoldFish", "Red", "58SRT", false);
        sound = nFish1.makeSound();

        System.out.println(sound);

        Hamster nHamster1 = new Hamster(0.3, 2, "Gery", "Grey", "59SRT", true);
        sound = nHamster1.makeSound();

        System.out.println(sound);
    }

    public String makeSound() {
        return "noise";
    }

}
