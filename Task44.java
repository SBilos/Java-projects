package work44;

public class Task44 {
    public static void main(String[] args) {
        int number = 1;
        int counter = 0;
        while (number < 300 &&counter < 10) {
            if (number % 3 == 0 || number % 4 == 0) {
                System.out.printf("%-3d", number);
                counter++;
            }
//            if (counter == 10) {
//                break;
//            }
            number++;
        }
    }
}
