import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // defining scanner
        Scanner scanner = new Scanner(System.in);

        // defining price 1 kg of fruits
        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double auberginePrice = 5;

        // defining and taking inputs of how much taken kilogram of fruits
        System.out.print("Armut Kaç Kilo : ");
        double pearCount = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo : ");
        double appleCount = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo : ");
        double tomatoCount = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo : ");
        double bananaCount = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo : ");
        double aubergineCount = scanner.nextDouble();

        // calculating total price of shopping and giving result
        double totalPrice = (pearPrice * pearCount) + (applePrice * appleCount) + (tomatoPrice * tomatoCount) + (bananaPrice * bananaCount) + (auberginePrice * aubergineCount);
        System.out.println("Toplam Tutar : " + totalPrice + " TL");


    }
}
