import java.util.Scanner;

public class RouteActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Welcome to Narvasa  Rail Transit Services!");
        System.out.println("Routes:");
        System.out.println("Cebu City (Start) -> Minglanilla -> San Fernando -> Carcar -> Barili -> Alcantara -> Moalboal (End)");

        System.out.print("Is Barili obstructed? (1 = Yes, 0 = No): ");
        int isBariliObstructed = scanner.nextInt();
        int isDumanjugObstructed = 0;

        if (isBariliObstructed == 1) {
            System.out.print("Is Dumanjug obstructed? (1 = Yes, 0 = No): ");
            isDumanjugObstructed = scanner.nextInt();
        }

        System.out.print("Enter your speed (km/hr): ");
        int speed = scanner.nextInt();

        double totalDistance = calculateTotalDistance(isBariliObstructed, isDumanjugObstructed);
        double[] totalTime = calculateTime(totalDistance, speed);
        String bestRoute = calculateBestRoute(isBariliObstructed, isDumanjugObstructed);

        System.out.println("\nRecommended Route: Cebu City (Start) -> Minglanilla -> San Fernando -> Carcar -> " + bestRoute + " -> Moalboal (End)");
        System.out.println("Additional Data: ");
        System.out.println("Speed: " + speed + " km/hr");
        System.out.println("Distance: " + totalDistance + " km");
        System.out.println("ETA: " + (int) totalTime[0] + " hours and " + (int) totalTime[1] + " minutes");

        scanner.close();
    }

    public static double[] calculateTime(double distance, double speed) {
        double totalHours = distance / speed;
        int hours = (int) totalHours;
        int minutes = (int) ((totalHours - hours) * 60);
        return new double[]{hours, minutes};
    }

    public static String calculateBestRoute(int isBariliObstructed, int isDumanjugObstructed) {
        if (isBariliObstructed == 1) {
            return (isDumanjugObstructed == 1) ? "Argao" : "Sibonga";
        } else {
            return "Barili";
        }
    }

    public static double calculateTotalDistance(int isBariliObstructed, int isDumanjugObstructed) {
        double[] routeDistances = {70.7, 63.1, 48.3, 30.3, 31.8};
        double totalDistance = routeDistances[0];

        if (isBariliObstructed == 1) {
            totalDistance += (isDumanjugObstructed == 1) ? routeDistances[4] : routeDistances[3];
        }
        return totalDistance;
    }
}
