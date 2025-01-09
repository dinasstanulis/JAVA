
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int positiveOrNot = Integer.parseInt(scan.nextLine());

        if (positiveOrNot > 0) {
            System.out.println("The number is positive");
        } else if (positiveOrNot <= 0) {
            System.out.println("The number is not positive");
        }
    }
}
