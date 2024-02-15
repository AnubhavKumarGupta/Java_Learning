import java.util.*;

public class Fever {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        if (d > 100) {
            System.out.println("You have a Fever & the Temperature is " + d);

        } else {
            System.out.println("You Don't have  Fever & the temperature is " + d);
        }

    }

}
