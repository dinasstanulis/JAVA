
import java.sql.SQLOutput;
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int i = 0;
        int evenAmount = 0;
        int oddAmount = 0;
        while (true) {
            System.out.println("Give numbers:");
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + i);
                System.out.println("Even: " + evenAmount);
                System.out.println("Odd: " + oddAmount);
                if (i > 0) {
                    double avg = (double) sum / i;
                    System.out.println("Average: " + avg);
                }
                break;

            }
            sum += number;
            i++;
            if (number % 2 == 0) {
                evenAmount++;
            } else {
                oddAmount++;
            }
            ;
        }
    }
}
