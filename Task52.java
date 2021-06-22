package work52;

public class Task52 {
    public static void main(String[] args) {
        String company = "National Aviation University";
        String abr = "" + company.charAt(0);

        abr += company.charAt(company.indexOf(' ') + 1);
        abr += company.charAt(company.lastIndexOf(' ') + 1);

        System.out.println(abr);

    }
}
