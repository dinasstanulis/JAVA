
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int i =0;

        while (true) {
            System.out.println("Give a number:");
            int answer = Integer.parseInt(scanner.nextLine());
            if (answer !=0) {
                sum = sum + answer;
            } else {
                System.out.println("Sum of the numbers: " + sum);
                break;}
        }
    }
    }

