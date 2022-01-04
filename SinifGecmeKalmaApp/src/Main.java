import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int counter = 0, sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = scanner.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = scanner.nextInt();

        System.out.print("Turkçe notunuz : ");
        turkce = scanner.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = scanner.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = scanner.nextInt();

        if (mat > 0 && mat <= 100){
            sum += mat;
            counter += 1;
        }
        if (fizik > 0 && fizik <= 100){
            sum += fizik;
            counter += 1;
        }
        if (turkce > 0 && turkce <= 100){
            sum += turkce;
            counter += 1;
        }
        if (kimya > 0 && kimya <= 100){
            sum += kimya;
            counter += 1;
        }
        if (muzik > 0 && muzik <= 100){
            sum += muzik;
            counter += 1;
        }


        double avarage = Double.parseDouble(String.valueOf(sum)) / Double.parseDouble(String.valueOf(counter));
        if (avarage <= 55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
            System.out.println("Ortalamanız : " + avarage);
        }
        else{
            System.out.println("Tebrikler, sınıfı geçtiniz !");
            System.out.println("Ortalamanız : " + avarage);
        }
    }
}
