import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        double sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        double sayi2 = scanner.nextDouble();
        System.out.print("Üçüncü sayıyı giriniz : ");
        double sayi3 = scanner.nextDouble();

        double[] sayilar = new double[] {sayi1, sayi2, sayi3};
        Arrays.sort(sayilar);

        System.out.print("Sıralama - ");
        for( double sayi : sayilar){
            System.out.print(sayi);
            System.out.print(" - ");
        }
    }
}
