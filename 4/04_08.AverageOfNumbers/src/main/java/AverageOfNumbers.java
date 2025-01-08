
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int i =0;
        double average;
        while (true) {
            System.out.println("Give a number:");
            int answer = Integer.parseInt(scanner.nextLine());
            i++;
            if (answer !=0) {
                sum = sum + answer;
            } else {
                i--;
                average = (double)sum / i;
                System.out.println("Average of the numbers: " + average);;
                break;}
        }
    }
    }

