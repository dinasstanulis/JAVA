
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            list.add(input);
        }

        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (min > number) {
                number = min;
            }
        }
        System.out.println("Smallest number: " + min);
        System.out.println("Found and index: " + list.indexOf(min));

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
