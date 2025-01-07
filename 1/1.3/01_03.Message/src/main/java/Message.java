
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a message: \n");
        String message = scanner.nextLine();
        System.out.println(message);
        scanner.close();

    }
}
