package lt.techin.praktinis;

public class CupsCalculator {

    public void calculateCups(int numberOfCups) {
        int dezes = numberOfCups/3;
        int likoPuodeliu = numberOfCups%3;
        System.out.println("Dėžių: " + dezes + "\nLiko puodelių: " + likoPuodeliu);

    }

}
