/**
 * Created by RMysholovka on 05.10.2015.
 */
public class Zoo {
    public static void main(String[] args) {
        if (Cat.domestic) {
            System.out.println("Cat is domestic animal");

        }
        if (Cat.predator) {
            System.out.println("cat is predator");

        }
        Cat tomCat = new Cat(true, 3, "Tom", "Blue-gray");


        Cat murzik = new Cat(true, 4, "Black", "Mursik");



        /*Cat murzik = new Cat();
        murzik.pet = true;
        murzik.age = 4;
        murzik.color = ";
        murzik.name = "Mursik";*/

        System.out.println(tomCat.name);
        System.out.println(murzik.age);
        System.out.println(Cat.predator);
    }
}
