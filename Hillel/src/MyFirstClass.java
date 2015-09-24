/**
 * Created by RMysholovka on 17.09.2015.
 */
public class MyFirstClass {
    public static void main(String[] args) {
        int age = 35;
        someMethod(age);

        System.out.println(age);

    }


    final int romaBirthYear = 1980;

    int age = 35;


    int romaAge = someMethod(romaBirthYear);


    private static int someMethod(int romaBirthYear) {
        int romaAge = calculateAge(romaBirthYear);
        System.out.println("Roma age: " + romaAge);
        int alexAge = calculateAge(1984);

        System.out.println("Alex age: " + alexAge);
        return romaAge;
    }

    private static void firstExempl(int romaBirthYear, int romaAge) {
        System.out.println("Before changes:" + romaBirthYear);


        System.out.println("I'm " + romaAge);

        System.out.println("31" + 31);

        System.out.println(31 + 31);
    }

    public static void sayHallo() {
        String helloMessage = "Hello world";
        System.out.println(helloMessage);

    }

    public static int calculateAge() {
        final int BirthYear = 1980;

        int year = 2015;
        int age = year - BirthYear;

        return age;
    }

    public static int calculateAge(int BirthYear) {

        int year = 2015;
        int age = year - BirthYear;

        return age;
    }

}
