import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("Enter miles: ");
        Scanner scan = new Scanner(System.in);
        int miles = scan.nextInt();
        double kilometers = miles * 1.6;
        System.out.printf("%d miles is %.2f kilometers", miles, kilometers);
    }
}