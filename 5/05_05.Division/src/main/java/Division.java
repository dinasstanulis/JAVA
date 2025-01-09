

public class Division {

    public static void main(String[] args) {

         division(3, 5);
    }

    public static void division(int numerator, int denominator) {
        double result;
        if (denominator != 0) {
            result = (double)numerator / denominator;
            System.out.println(result);
        }
    }
}
