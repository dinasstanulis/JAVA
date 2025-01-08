
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of a gift?");
        int value = scan.nextInt();

        double taxOne = (100 + (value-5000)*0.08);
        double taxTwo = (1700 + (value-25000)*0.1);
        double taxThree = (4700 + (value-55000)*0.12);
        double taxFour = (22100 + (value-200_000)*0.15);
        double taxFive = (142100 + (value-1000000)*0.17);

        if (value>=1_000_000) {
            System.out.println("Tax:" + taxFive);
        } else if (value>200000) {
            System.out.println("Tax" + taxFour);
        } else if (value>55000) {
            System.out.println("Tax" + taxThree);
        } else if (value>25000) {
            System.out.println("Tax" + taxTwo);
        } else if (value>5000) {
            System.out.println("Tax" + taxOne);
        } else {
            System.out.println("No tax!");
        }
    }
}
