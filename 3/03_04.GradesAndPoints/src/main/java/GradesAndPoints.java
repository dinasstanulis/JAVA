
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int points = Integer.parseInt(scan.nextLine());

        if (points > 100) {
            System.out.println("incredible!");
        } else if (points >= 90) {
            System.out.println("5");
        } else if (points >= 80) {
            System.out.println("4");
        } else if (points >= 70) {
            System.out.println("3");
        } else if (points >= 60) {
            System.out.println("2");
        } else if (points >= 50) {
            System.out.println("3");
        } else if (points >= 0) {
            System.out.println("failed");
        } else {
            System.out.println("impossible!");
        }

    }
}
