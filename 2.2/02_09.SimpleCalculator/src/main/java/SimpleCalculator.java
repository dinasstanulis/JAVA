
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int numberFirst = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number: ");
        int numberSecond = Integer.parseInt(scanner.nextLine());

        int sum = numberFirst + numberSecond;
        int subtract = numberFirst - numberSecond;
        int multiply = numberFirst * numberSecond;
        double divide = (double) numberFirst / numberSecond;

        System.out.println(numberFirst + " + " + numberSecond + "=" + sum);
        System.out.println(numberFirst + " - " + numberSecond + "=" + subtract);
        System.out.println(numberFirst + " * " + numberSecond + "=" + multiply);
        System.out.println(numberFirst + " / " + numberSecond + "=" + divide);
    }
}
