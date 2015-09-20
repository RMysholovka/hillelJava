/**
 * Created by ${Roman} on 20.09.2015.
 */
class AboutMyself {
    public static void main(String[] args){
        String MyName = "Roman";
        String MyLastName = "Mysholovka";
        int YearOfBirth = 1980;
        int CurrentYear = 2015;
        int MyAge = CurrentYear - YearOfBirth;


        System.out.println("I'm: "+ MyName + " " + MyLastName);
        System.out.println("My age: " + MyAge);

        System.out.print("I'm: " + MyName); //альтернативный способ вывода
        System.out.print(" ");
        System.out.println(MyLastName);
        System.out.println("My age: " + MyAge);
    }

}
