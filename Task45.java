package work45;

public class Task45 {
    public static void main(String[] args) {
        System.out.print("* |");
        int digit = 1;
        while (digit < 10) {
            System.out.printf("%3d", digit);
            digit++;

        }
        System.out.println();
        while (digit > 0) {
            System.out.print("---");
            digit--;
        }
        System.out.println();

        digit++;
        while (digit < 10) {
            System.out.print(digit + " |");
            int digit2 = 1;
            while (digit2 < 10) {
                System.out.printf("%3d", digit*digit2);
                digit2++;
            }

            digit++;
            System.out.println();
        }

    }
}
