
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int message = Integer.parseInt(scan.nextLine());

        System.out.println(message * 86400);


    }
}
