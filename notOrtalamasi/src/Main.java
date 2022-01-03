import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // notlar
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // inputlar için scanner
        Scanner input = new Scanner(System.in);

        // kullanıcıdan not bilgileri alınır
        System.out.print("Matematik notunu giriniz : ");
        matematik = input.nextInt();
        System.out.print("Fizik notunu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Turkce notunu giriniz : ");
        turkce = input.nextInt();
        System.out.print("Tarih notunu giriniz : ");
        tarih = input.nextInt();
        System.out.print("Müzik notunu giriniz : ");
        muzik = input.nextInt();

        // ortalama hesaplanır.
        double toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6;

        // çıktı yazılır.
        System.out.println(ortalama > 60 ? "Sınıfı başarıyla " + ortalama + " ortalama ile geçtiniz." :  ortalama + " ortalama ile maalesef sınıfta kaldınız.");
    }
}
