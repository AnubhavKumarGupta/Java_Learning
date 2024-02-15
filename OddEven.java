import java.util.*;

public class OddEven {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        if (Num % 2 == 0) {
            System.out.println("Input no. is even and the no. is " + Num);
        } else {
            System.out.println("Input no. is odd and the no. is " + Num);
        }
    }
}
