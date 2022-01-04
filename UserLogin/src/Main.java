import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz : ");
        String username = scanner.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        String password = scanner.nextLine();

        if (username.equals("omerumutluu") && password.equals("test")) {
            System.out.println("Giriş işlemi başarılı");
        } else if (!password.equals("test")) {
            System.out.print("Şifreniz hatalı. Sıfırlamak ister misiniz ? (evet/hayır) : ");
            String islem = scanner.nextLine();
            if (islem.equals("evet")) {
                System.out.print("Yeni şifreyi giriniz : ");
                String newPassword = scanner.nextLine();
                while (newPassword.equals("test")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz : ");
                    newPassword = scanner.nextLine();
                }
                System.out.println("Şifre oluşturuldu.");
            }
        }
        else{
            System.out.println("Bu kullanıcı adına sahip bir kullanıcımız bulunmamaktadır.");
        }
    }
}
