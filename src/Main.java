import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance to travel in nautical miles: ");
        double nauticalMiles = scanner.nextDouble();
        double regularMiles = nauticalMiles*1.1508;
        System.out.print("Enter the top speed of the boat in knots: ");
        double topSpeed = scanner.nextDouble();
        double bestCase = nauticalMiles/topSpeed;
        System.out.print("Enter the top speed of the boat in knots: ");
        double aveSpeed = scanner.nextDouble();
        double aveCase = nauticalMiles/aveSpeed;
        System.out.println("\nThe distance to travel in regular miles is: " + regularMiles + " miles\nThe best case travel time is: " + bestCase + " hours at " + topSpeed + " knots\nThe average case travel time is: " + aveCase + " hours at " + aveSpeed + " knots");



    }
}
