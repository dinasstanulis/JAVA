package lt.techin.praktinis;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double fahrenheit = (temperatureCelsius * 1.8) + 32;
        System.out.print(fahrenheit);
    }
}
