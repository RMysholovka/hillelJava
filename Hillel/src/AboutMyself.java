/**
 * Created by ${Roman} on 20.09.2015.
 */
class AboutMyself {
    public static void main(String[] args){
        String myName = "Roman";
        String myLastName = "Mysholovka";
        int yearOfBirth = 1980;
        int currentYear = 2015;
        int myAge = currentYear - yearOfBirth;


        System.out.println("I'm: " + myName + " " + myLastName);
        System.out.println("My age: " + myAge);

        System.out.print("I'm: " + myName); //альтернативный способ вывода
        System.out.print(" ");
        System.out.println(myLastName);
        System.out.println("My age: " + myAge);
    }

}
