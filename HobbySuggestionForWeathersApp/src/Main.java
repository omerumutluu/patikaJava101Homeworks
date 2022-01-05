import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Şu an hava kaç derece : ");
        double havaDurumu = scanner.nextDouble();

        if (havaDurumu < 5)
            System.out.println("Kayak yapmak uygun olacaktır.");
        else if (havaDurumu < 15)
            System.out.println("Sinema bu havalar için tam ideal");
        else if (havaDurumu < 25)
            System.out.println("Piknik bu hava için bire bir bir etkinlik");
        else
            System.out.println("Hava yanıyor. Koş yüzmeye düşünmene gerek bile yok.");
    }
}
