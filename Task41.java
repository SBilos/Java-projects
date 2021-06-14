package work41;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = -10;
        int max;

        // variant 1

//        if (x >= y) {
//            if (x >= z) {
//                max = x;
//            } else {
//                max = z;
//            }
//        } else if (y >= z) {
//            max = y;
//        } else {
//            max = z;
//        }

        // variant 2

//        if (x >= y && x >= z) {
//           max = x;
//        } else if (y >= z && y >= x) {
//            max = y;
//        } else {
//            max = z;
//        }

        // variant 3
        max = x;
        if (y > max) {
            max = y;
        } if (y >= z && y >= x) {
            max = y;
        }
        if (z > max) {
            max = z;
        }

        System.out.printf("Max = " + max);
    }
}
