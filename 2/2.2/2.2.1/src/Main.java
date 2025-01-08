
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Give a number:");
        int message = Integer.parseInt(number.nextLine());
        System.out.println("You gave the number " + message);


    }
}