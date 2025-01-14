
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.print("From where? ");
        int input1 = scanner.nextInt();
        System.out.print("To where? ");
        int input2 = scanner.nextInt();
        for (int i = input1; i <= input2; i++){
            System.out.println(numbers.get(i));
        }
    }
}
