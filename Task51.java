package work51;

public class Task51 {
    public static void main(String[] args) {
        String text = "The decimal system, invented in India around AD 600, was a revolution in quantitative" +
                "reasoning: using only 10 symbols, even very large numbers could be written down compactly";

        int size = text.length() / 2;
        String subText = text.substring(size);
        System.out.println(subText);
    }
}
