// Java Program to Print an Integer (Entered by the User)

import java.util.*;

class TwoNo {
    public static void main(String... args) {
        Scanner N1 = new Scanner(System.in);
        Scanner N2 = new Scanner(System.in);
        int Num1 = N1.nextInt();
        int Num2 = N2.nextInt();
        int Sum = (Num1 + Num2);
        System.out.println(Sum);

    }

}