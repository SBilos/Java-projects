package work54;

public class Task54 {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        myStr1 = myStr1.toLowerCase();
        myStr2 = myStr2.toLowerCase();

        int position = 0;
        while (position < myStr1.length()) {
            char ch = myStr1.charAt(position);
            if (myStr2.indexOf(ch) == -1) {
                System.out.print(ch +" ");
            }
            position++;
        }
    }
}
