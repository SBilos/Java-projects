package work23;

public class Task23 {
    public static void main(String[] args) {
        int value1 = 100;
        int value2 = -78;

        value1 = value1 + value2;
        value2 = value1 - value2;
        value1 = value1 - value2;

        System.out.println("Value1= " + value1 + "\nValue= " + value2);
    }
}
