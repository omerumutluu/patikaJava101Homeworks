import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // defining scanner
        Scanner scanner = new Scanner(System.in);

        // define and input edges from user input
        System.out.print("Birinci kenarın uzunluğunu giriniz : ");
        double edge1 = scanner.nextDouble();
        System.out.print("İkinci kenarın uzunluğunu giriniz : ");
        double edge2 = scanner.nextDouble();
        System.out.print("Üçüncü kenarın uzunluğunu giriniz : ");
        double edge3 = scanner.nextDouble();

        // calculate a area of triangle
        double u = (edge1 + edge2 + edge3) / 2;
        double area = Math.sqrt(u * (u - edge1) * (u - edge2) * (u - edge3));

        // give result
        System.out.println(edge1 + " - " + edge2 + " - " + edge3 + " kenarlı üçgenin alanı :  " + area);

    }
}
