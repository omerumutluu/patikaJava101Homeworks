import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // defining scanner
        Scanner scanner = new Scanner(System.in);

        // defining and taking user weight and height
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        double boy = Double.parseDouble(scanner.nextLine());

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = Double.parseDouble(scanner.nextLine());

        // calculating vki and giving result
        double vki = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz : " + vki);
    }
}
