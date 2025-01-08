
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        double message = Double.parseDouble(scan.nextLine());

        System.out.println("You gave the number " + message);


    }
}
