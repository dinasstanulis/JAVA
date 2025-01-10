package lt.techin.praktinis;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        int liekana;
        while (number > 0) {
            liekana = number % 10;
            sum += liekana;
            number = number /10;
        }
        System.out.println(sum);
    }

}


