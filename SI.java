import java.util.Scanner;

public class SI {
    public static void main(String... args) {
        Scanner p = new Scanner(System.in);
        int principal = p.nextInt();
        float rate = p.nextFloat();
        int time = p.nextInt();
        System.out.println((principal * rate * time) / 100);
    }

}
