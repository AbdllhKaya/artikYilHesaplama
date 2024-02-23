import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner tanımlaması yapıldı.
        Scanner ak = new Scanner(System.in);

        // integer veri tipinde değişken tanımlandı.
        int yil;

        // Kullanıcıdan veri istenildi.
        System.out.print("Yılı giriniz = ");
        yil = ak.nextInt();

        /* Artık yıl 4 rakamının katı olan yıllardır.
        Ayrıca 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır.
        Bu bilgiler doğrultusunda kullanıcının girdiği veri sorgulandı */
        if (yil % 4 == 0) {
            System.out.print( yil+" artık yıldır!");
        } else if ((yil % 100 == 0 && yil % 400 == 0 )) {
            System.out.print( yil+" yıl artık yıldır!");
        } else {
            System.out.print( yil+" artık yıl değildir!");
        }
    }
}
