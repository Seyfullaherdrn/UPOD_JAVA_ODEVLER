import java.util.Scanner;

public class StringWithStars {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("Metni girin: ");
        String metin = giris.nextLine();
        giris.close();

        String donusturulmus = metniYildizlarlaDonustur(metin);
        System.out.println(donusturulmus);
    }

    public static String metniYildizlarlaDonustur(String metin) {
        StringBuilder sonuc = new StringBuilder();
        int uzunluk = metin.length();

        for (int i = 0; i < uzunluk; i++) {
            char gecerliKarakter = metin.charAt(i);
            sonuc.append(gecerliKarakter);

            if (i < uzunluk - 1) {
                char sonrakiKarakter = metin.charAt(i + 1);

                if (gecerliKonum(gecerliKarakter, sonrakiKarakter)) {
                    sonuc.append("*");
                }
            }
        }

        return sonuc.toString();
    }

    public static boolean gecerliKonum(char gecerliKarakter, char sonrakiKarakter) {
        char[] gecersizKarakterler = {' ', '.', ','};

        for (char c : gecersizKarakterler) {
            if (gecerliKarakter == c || sonrakiKarakter == c) {
                return false;
            }
        }

        return true;
    }
}
