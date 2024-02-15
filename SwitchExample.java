import java.util.*;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (a > b && a > c ? a : b > a && b > c ? b : c);
        System.out.println("the greator among all and the no. is " + d);

    }
}
