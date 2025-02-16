package lt.techin.praktinis;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int n = 3;
        int[] arr = {3, 2, 1, 3, 6, 5};

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);

    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        return arr[0];
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {

        return arr[arr.length-1];
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]<min) {
            min = arr[i];
        }
    }
        return min;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        double sum = 0;
        double count = 0;
        for (int j : arr) {
            count++;
            sum += j;
        }
        return sum / count;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (n<arr[i]) {
                count++;
            }
        }
        return count;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (n==arr[i]) {
                return true;
            }
        }
        return result;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        for (int i = arr.length -1; i >=0; i--) {
            if (arr[i]==n){
                return i;
            }
        }

        return -1;
    }






}
