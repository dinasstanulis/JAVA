import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int i =0;

        while (true) {
            System.out.println("Give a number:");
            int answer = Integer.parseInt(scanner.nextLine());
            i++;
            if (answer !=0) {
                sum = sum + answer;
            } else {
                i--;
                System.out.println("Number of numbers: " + i);
                System.out.println("Sum of the numbers: " + sum);
                break;}
        }
    }
}
