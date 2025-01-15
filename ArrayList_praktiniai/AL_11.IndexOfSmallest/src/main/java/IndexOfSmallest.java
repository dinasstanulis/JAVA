
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
        System.out.println("Found at index: " + list.indexOf(min));

        // need 2 for to get every smallest number

        
    }
}
