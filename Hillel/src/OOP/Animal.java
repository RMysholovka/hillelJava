package OOP;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by RMysholovka on 08.10.2015.
 */
public abstract class Animal implements Vaccinable, Serializable {
    private String name;
    private int age;
    private String[] vaccines = new String[3];
    private int vaccineCounter = 0;

    public Animal(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void vaccinate(String vaccine) {
        vaccines[vaccineCounter] = vaccine;
        vaccineCounter++;
    }


    public String toString() {
        String result = "name: " + name;
        result += " age: " + age;
        result += " vaccines: " + Arrays.toString(vaccines);
        return result;
    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (vaccineCounter != animal.vaccineCounter) return false;
        if (name != null ? !name.equals(animal.name) : animal.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(vaccines, animal.vaccines);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (vaccines != null ? Arrays.hashCode(vaccines) : 0);
        result = 31 * result + vaccineCounter;
        return result;
    }



    public abstract String makeSound();
}
