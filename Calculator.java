import java.util.*;

public class Calculator {
    public static void main(String... args) {
        System.out.println("Enter the number & the operation which you wants to perform");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
            default:
                System.out.println("Please Enter the valid one Operations!");

        }

    }

}
