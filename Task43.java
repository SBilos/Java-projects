package work43;

public class Task43 {
    public static void main(String[] args) {
        int numberLine = 1;
        while (numberLine <= 8) {
            int digit = numberLine;
            while (digit > 0) {
                System.out.print(digit + " ");
                digit--;
            }
            System.out.println();
            numberLine++;
        }
    }
}
