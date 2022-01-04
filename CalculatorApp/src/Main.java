import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // defining scanner
        Scanner scanner = new Scanner(System.in);

        // show main options menu to user
        System.out.print("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme\n\nİşlem Seçiminiz : ");
        // define and take process type
        int process = scanner.nextInt();

        // check process is valid
        if(process != 1 && process != 2 && process != 3 && process != 4){
            System.out.print("Hatalı işlem seçimi. Tekrar Deneyiniz : ");
            process = scanner.nextInt();
        }
        else{
            // define and take numbers
            System.out.print("Birinci sayıyı giriniz : ");
            double number1 = scanner.nextDouble();
            System.out.print("ikinci sayıyı giriniz : ");
            double number2 = scanner.nextDouble();
            // do operation and show result
            switch (process) {
                case 1 -> System.out.println("Toplam: " + (number1 + number2));
                case 2 -> System.out.println("Fark: " + (number1 - number2));
                case 3 -> System.out.println("Çarpım: " + (number1 * number2));
                case 4 -> System.out.println("Bölüm: " + (number1 / number2));
            }
        }
    }
}
