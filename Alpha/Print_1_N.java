import java.util.*;

public class Print_1_N {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        int count = 1;
        while (count <= l) {
            System.out.println(count);
            count++;
        }
    }
}
