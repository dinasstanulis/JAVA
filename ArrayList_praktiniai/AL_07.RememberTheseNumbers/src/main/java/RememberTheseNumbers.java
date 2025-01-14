
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);

        }
        for (int i:numbers) {
            System.out.println(i);

//            for (int j = 0; j <numbers.size(); j++) {
//                System.out.println(numbers.get(j)); THIS IS SAME AS ABOVE
            }
        }
    }

