import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance to travel in nautical miles: ");
        double nauticalMiles = scanner.nextDouble();
        double regularMiles = nauticalMiles*1.1508;
        System.out.println("Enter the top speed of the boat in knots: ");
        double topSpeed = scanner.nextDouble();
        double bestCase = nauticalMiles/topSpeed;
        System.out.println("Enter the top speed of the boat in knots: ");
        double aveSpeed = scanner.nextDouble();
        double aveCase = nauticalMiles/aveSpeed;
        System.out.println("The distance to travel in regular miles is: " + regularMiles + " miles");
        System.out.println("The best case travel time is: " + bestCase + " hours at " + topSpeed + " knots");
        System.out.println("The average case travel time is: " + aveCase + " hours at " + aveSpeed + " knots");



    }
}
