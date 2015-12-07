package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by RMysholovka on 03.12.2015.
 */
public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ivan", 4500));
        employeeList.add(new Manager("Petro", 5500));
        print(employeeList);

        List<Manager> managerList = new ArrayList<>();
        managerList.add(new Manager("Ivan", 4500));
        managerList.add(new Manager("Petro", 5500));
        print(managerList);

        addEmployee(employeeList);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alex"));

        addEmployee(personList);

        List<Employee> copyEmployeeList = new ArrayList<>();

        copy(employeeList, copyEmployeeList);
        System.out.println(copyEmployeeList.size());
    }

    public static <K, V> void copy(Pair<K, V> source, Pair<K, V> target) {

        target.key = source.key;
        target.value = source.value;
    }

    public static <T> void copy(List<T> source, List<T> target) {
        target.addAll(source);
    }

    public static <T> List<T> copyFunction(List<T> source, List<T> target) {
        target.addAll(source);
        return target;
    }


    public static void addEmployee(List<? super Employee> list) {
        list.add(new Employee("Ivan", 500));
        Object e = list.get(0);
    }

    public static void print(List<? extends Employee> list) {
        for (Employee e : list) {
            System.out.println(e);
        }
        // list.add(new Employee("",1));
    }


    private static void rawTypeExemple() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ivan", 4500));

        employeeList.add(new Manager("Petro", 5500));

        printEmployees(employeeList);

        List<Employee> personList = employeeList;

        printPerson(personList);

        // personList.add(new Person("Anatoliy"));

        printPerson(personList);

        printEmployees(employeeList);
    }

    private static void printEmployees(List<Employee> employeeList) {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    private static void printPerson(List personList) {
        for (Object o : personList) {
            Person p = (Person) o;
            System.out.println(p);
        }
    }

    private static void simpleExemple() {
        Employee e = new Manager("Ivan", 500);
        ArrayList<Employee> arrayList = new ArrayList<>();

        List<Employee> employeeList = arrayList;


        //  Collection<Employee> collection =  list;

        //list.add(new Person("Ivan", 500));
        //  list.add(new Employee("Ivan", 500));
        // list.add(new Manager("Petro", 1000));

        Person p = new Employee("Ivan", 500);

        // List<Person> personList = employeeList;
    }


    private static void pairExample() {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Vasya"));
        // list.add(new Object());

        Person vasya = list.get(0);
        Object o = list.get(1);

        list.add(new Employee("Petr", 10));

        Pair<Employee, Manager> pair = new Pair<>();

        Employee e = pair.key;
        Manager m = pair.value;
    }
}
