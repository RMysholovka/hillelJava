package OOP.incapsulation;

/**
 * Created by RMysholovka on 15.10.2015.
 */
public class IncapsulationMain {
    public static void main(String[] args) {
        ImprovedArray array = new ImprovedArray();
        array.add('k');
        array.add(2);
        array.add(12);
        array.add(14);
        array.add('b');
        array.add(34);
        array.add(56);
        array.add(32);

        System.out.println(array);
    }
}
