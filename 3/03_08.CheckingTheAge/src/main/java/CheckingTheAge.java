
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.parseInt(scan.nextLine());

        if (age<0) {
            System.out.println("impossible!");
        } else if (age>120) {
            System.out.println("impossible!");
        } else {
            System.out.println("OK");
        }
    }
}
