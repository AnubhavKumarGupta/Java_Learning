import java.util.*;

public class LastDigit {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int rev = 0;

        while (i > 0) {
            int ld = i % 10;
            rev = (rev * 10) + ld;
            i = i / 10;
        }
        System.out.println(rev);
    }
}
