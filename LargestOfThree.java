import java.util.*;

public class LargestOfThree {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("a is greator among all and the no. is " + a);
        } else if (b > c && b > a) {
            System.out.println("b is greator among all and the no. is " + b);
        } else {
            System.out.println("c is greator among all and the no. is  " + c);
        }
    }
}
