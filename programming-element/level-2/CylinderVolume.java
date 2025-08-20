import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();
        int height = sc.nextInt();

        int volume = (int)(3.14 * radius * radius * height); // cast to int
        System.out.println(volume);

        sc.close();
    }
}
