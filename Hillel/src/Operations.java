/**
 * Created by RMysholovka on 24.09.2015.
 */
public class Operations {
    public static void main(String[] args) {
        int res = 5 + 89;

        res = res + 1;
        res += 1;
        res++;
        ++res;

        print(res++);
        print(++res);

        int mod = 5 % 4;

        print(mod);

        boolean paid = false;
        boolean advert = true;

        boolean canAttend = paid || advert;
        System.out.println("can attend classes " + canAttend);

        canAttend = paid && hasEnoughKnowledge();

        System.out.println("can attend classes " + canAttend);

        boolean priorities = (advert() | hasEnoughKnowledge()) & paid();
        System.out.println("prioritet " + priorities);

        int message = 100;

        int key = 31;

        System.out.println(" message is " + message);

        int crypted = message ^ key;
        System.out.println("crypted message is " + crypted);

        int uncrypted = crypted ^ key;
        System.out.println("uncrypted message is " + uncrypted);


    }


    public static boolean paid() {

        System.out.println("in paid method ");

        return true;
    }


    public static boolean advert() {

        System.out.println("in advert method ");

        return false;
    }

    public static boolean hasEnoughKnowledge() {

        System.out.println("in advert method ");

        return false;
    }


    public static void print(int i) {
        System.out.println(i);

    }

}
