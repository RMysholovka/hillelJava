package OOP;

/**
 * Created by RMysholovka on 12.10.2015.
 */
public class AbstractZooExample {
    public static void main(String[] args) {


        // Animal dog = new Dog();

        printSound(new Cat());
        //  printSound(dog);

        Cat cat = new Cat();
        vaccinate(cat);
        //   vaccinate(dog);


        Employee employee = new Employee();
        vaccinate(employee);

        System.out.println(cat);
        //  System.out.println(dog.toString());
        System.out.println(employee);


    }

    public static void vaccinate(Vaccinable animalOrEmployee) {
        animalOrEmployee.vaccinate("ASD-1");

    }

    public static void printSound(Animal animal) {
        System.out.println(animal.makeSound());
    }

}
