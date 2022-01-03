import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // defining scanner for inputs
        Scanner scanner = new Scanner(System.in);

        // defining, taking radius and central angle of circle
        System.out.print("Enter radius of circle : ");
        double radius = scanner.nextDouble();

        System.out.print("Enter central angle of circle : ");
        double centralAngle = scanner.nextDouble();

        // defining const pi value = 3.14
        double pi = 3.14;

        //calculating perimeter of circle
        double perimeterOfCircle = (pi * (radius * radius) * centralAngle) / 360;

        // giving result
        System.out.println("Perimeter of Circle : " + perimeterOfCircle);

    }
}
