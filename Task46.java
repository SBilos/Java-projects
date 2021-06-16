package work46;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number -> ");
        int number = scanner.nextInt();

        number = number < 0 ? -number : number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        System.out.println("Sum digits -> " + sum);
    }
}
