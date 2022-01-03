import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // defining scanner
        Scanner scanner = new Scanner(System.in);

        // defining kilometer input from user
        System.out.print("Kaç kilometre yolculuk yaptınız : ");
        double kilometer = scanner.nextDouble();

        // defining taxi's open price
        double taxiOpeningPrice = 10;

        // defining and calculating total price of taxi travel
        double priceOfTotal = taxiOpeningPrice + (kilometer * 2.2);

        // giving result
        if (priceOfTotal < 20) {
            System.out.println("Ödemeniz gereken tutar : 20 TL");
        }
        else{
            System.out.println("Ödemeniz gereken tutar : " + priceOfTotal + " TL");
        }

    }
}
