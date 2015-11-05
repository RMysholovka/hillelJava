package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

/**
 * Created by RMysholovka on 05.11.2015.
 */
public class MapUsage {
    public static void main(String[] args) {
        Map<String, Integer> nameToSalary = new HashMap<>();

        nameToSalary.put("Vasya", 50);
        nameToSalary.put("Tolya", 100);
        nameToSalary.put("Kolya", 150);


        System.out.println(nameToSalary.get("Kolya"));


        for (String name : nameToSalary.keySet()) {
            Integer salary = nameToSalary.get(name);

            System.out.println(name + ": " + salary);
        }


        for (Entry<String, Integer> entry : nameToSalary.entrySet()) {
            String name = entry.getKey();
            Integer salary = entry.getValue();
            System.out.println(name + ": " + salary);
        }
    }

}
