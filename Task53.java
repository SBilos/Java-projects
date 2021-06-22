package work53;

public class Task53 {
    public static void main(String[] args) {
        String str = "An information system is designed to collect, process, store and distribute information";

        int firstPos = str.indexOf(" ");
        int lastPos = str.lastIndexOf(" ") + 1;
        String firstWord = str.substring(0, firstPos);
        String lastWord = str.substring(lastPos);
        String text = str.substring(firstPos, lastPos);

//        str = lastWord + text + firstWord;
        str = str.substring(lastPos) + str.substring(firstPos, lastPos) + str.substring(0, firstPos);

        System.out.println(str);

    }
}
