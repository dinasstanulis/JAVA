import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        double average;

        while (true) {
            System.out.println("Give a number:");
            int answer = Integer.parseInt(scanner.nextLine());
            if (answer > 0) {
                sum += answer;
                i++;
            }
            else if (answer < 0) {
            }
            else {
                if (i == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    average = (double) sum / i;
                    System.out.println("Average of the numbers: " + average);
                }
                break;
            }
        }
    }
}
