import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        double totalInches = heightCm / 2.54; // cm to inches
        int feet = (int) (totalInches / 12);  // full feet
        double inches = totalInches % 12;     // remaining inches

        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + String.format("%.2f", inches));

        input.close();
    }
}
