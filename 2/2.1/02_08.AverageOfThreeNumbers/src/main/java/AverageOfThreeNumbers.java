
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(number.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(number.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(number.nextLine());

        double sum = (first + second + third) / 3.0;

        System.out.println("The average is " + sum);

    }
}
