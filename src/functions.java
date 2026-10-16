import java.util.*;
public class functions {
    public static int multiply(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = multiply(a, b);
        System.out.print("product of 2 numbers is :" + multiply);


    }
}




