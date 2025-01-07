import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? \n");

        String message = scanner.nextLine();

        System.out.println("Hi " + message);

        scanner.close();
    }
}