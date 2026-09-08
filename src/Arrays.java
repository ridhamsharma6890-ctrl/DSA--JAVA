// ARRAYS
import java.util.Scanner;

public class Arrays{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}