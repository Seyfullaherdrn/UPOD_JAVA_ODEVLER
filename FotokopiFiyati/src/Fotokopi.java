
/*SeyfullahErduran*/



import java.util.Scanner;

public class Fotokopi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kopya sayısını girin: ");
        int kopyaSayisi = scanner.nextInt();
        scanner.close();

        fiyatHesapla(kopyaSayisi);
    }

    public static void fiyatHesapla(int kopyaSayisi) {
        int yirmiBesKopya = 0;
        int onikiKopya = 0;
        int birKopya = 0;

        while (kopyaSayisi >= 25) {
            yirmiBesKopya++;
            kopyaSayisi -= 25;
        }

        while (kopyaSayisi >= 12) {
            onikiKopya++;
            kopyaSayisi -= 12;
        }

        while (kopyaSayisi > 0) {
            birKopya++;
            kopyaSayisi--;
        }

        double toplamFiyat = (yirmiBesKopya * 1.0) + (onikiKopya * 0.5) + (birKopya * 0.05);
        System.out.println("Toplam fiyat: " + toplamFiyat + " TL");
    }
}

