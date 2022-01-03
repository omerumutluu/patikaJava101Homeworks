import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // defining scanner
        Scanner scanner = new Scanner(System.in);

        // define price input and kdvPrice
        double price;
        double kdvPrice;

        // input label for user
        System.out.print("Kdv miktarını hesaplamak istediğiniz para miktarını giriniz : ");

        // define price's value input from user
        price = scanner.nextDouble();

        if (price > 0 && price < 1000){
            kdvPrice = price * 18/100;
            System.out.println("Girmiş olduğunuz " + price + " TL'nin üzerine düşen KDV miktarı : " + kdvPrice + " TL");
            System.out.println("KDV ile birlikte toplam fiyat : " + (price + kdvPrice));
        }
        else if (price > 1000){
            kdvPrice = price * 8/100;
            System.out.println("Girmiş olduğunuz " + price + " TL'nin üzerine düşen KDV miktarı : " + kdvPrice + " TL");
            System.out.println("KDV ile birlikte toplam fiyat : " + (price + kdvPrice));
        }
        else{
            System.out.println("Para miktarı 0'dan yüksek olmalıdır.");
        }
    }
}
