import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.println("Enter the number of minutes:");
        Scanner scan = new Scanner(System.in);
        int minutes = scan.nextInt();
        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days ");
    }
}
