import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Asalsayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        boolean[] asal = new boolean[sayi + 1];
        List<Integer> asalSayilar = new ArrayList<>();

        for (int i = 2; i <= sayi; i++) {
            asal[i] = true;
        }

        for (int p = 2; p * p <= sayi; p++) {
            if (asal[p]) {
                for (int i = p * p; i <= sayi; i += p) {
                    asal[i] = false;
                }
            }
        }

        for (int i = 2; i <= sayi; i++) {
            if (asal[i]) {
                asalSayilar.add(i);
            }
        }

        System.out.print("Girilen sayıya kadar olan asal sayılar: ");
        for (int i = 0; i < asalSayilar.size(); i++) {
            System.out.print(asalSayilar.get(i));
            if (i != asalSayilar.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
