
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String messageName = scanner.nextLine();
        System.out.println("What is their job?");
        String messageJob = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + messageName + ", who was " + messageJob + ".");
        System.out.println("On the way to work, " + messageName + " reflected on life.");
        System.out.println("Perhaps " + messageName + " will not be " + messageJob + " forever.");

    }
}
