public class square {
    public static void main(String[] args) {
        for (int j = 1; j < 8; j++) {

            System.out.print("#");
            for (int i = 1; i < 8; i++) {
                if (j > 1 && j < 7 && i < 7) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
