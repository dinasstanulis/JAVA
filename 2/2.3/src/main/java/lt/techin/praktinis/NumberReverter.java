package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
        int apverstas = 0;
        int liekana;
        while (number > 0) {
            liekana = number % 10;
            apverstas =(apverstas * 10) + liekana;
            number = number /10;
        }
        System.out.println(apverstas);
    }
}
