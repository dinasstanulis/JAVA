
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;

        while (true) {
            System.out.println("Give a number:");
            i++;
            int answer = Integer.parseInt(scanner.nextLine());
            if (answer == 0) {
                --i;
                System.out.println("Number of numbers: " + i);
                break;}
    }
}}
