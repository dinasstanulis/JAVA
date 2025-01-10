
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++ ) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++ ) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height*2; i+=2) {
            printSpaces(height-i/2-1);
            printStars(i);
        }
        for (int i = 0; i <= 1; i++ ) {
            printSpaces(((height*2-1)-3)/2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
