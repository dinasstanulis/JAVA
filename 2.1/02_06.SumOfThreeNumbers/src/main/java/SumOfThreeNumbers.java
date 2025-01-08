
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(number.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(number.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(number.nextLine());

        int sum = first + second + third;

        System.out.println("The sum of the numbers is " + sum);

    }
}
