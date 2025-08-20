public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double kmToMiles = 0.621371; // conversion factor
        double pi = Math.PI;

        // Volume formula: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert radius to miles before volume calculation
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}
