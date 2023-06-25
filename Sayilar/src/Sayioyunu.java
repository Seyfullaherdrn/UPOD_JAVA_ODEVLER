import  java.util.Scanner ;

public class Sayioyunu {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int secim;
        do {
            System.out.println("1. Asal Sayı Kontrolü");
            System.out.println("2. Fibonacci Serisi");
            System.out.println("3. Mükemmel Sayı Kontrolü");
            System.out.println("0. Çıkış");
            System.out.print("Bir seçenek girin: ");
            secim = scanner.nextInt();
            System.out.println("...............................................");
            switch (secim) {
                case 1:
                    System.out.print("Bir sayı girin: ");
                    int sayi = scanner.nextInt();
                    boolean asalMi = asalSayiKontrolu(sayi);
                    if (asalMi) {
                        System.out.println(sayi + " bir asal sayıdır.");
                    } else {
                        System.out.println(sayi + " bir asal sayı değildir.");
                    }
                    break;
                case 2:
                    System.out.print("Kaç terimlik Fibonacci serisi hesaplanacak: ");
                    int n = scanner.nextInt();
                    System.out.println(n + " terimlik Fibonacci serisi:");
                    fibonacciSerisi(n);
                    break;
                case 3:
                    System.out.print("Bir sayı girin: ");
                    int num = scanner.nextInt();
                    boolean mukemmelMi = mukemmelSayiKontrolu(num);
                    if (mukemmelMi) {
                        System.out.println(num + " bir mükemmel sayıdır.");
                    } else {
                        System.out.println(num + " bir mükemmel sayı değildir.");
                    }
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçenek girdiniz. Tekrar deneyin.");
            }
            System.out.println("...............................................");

    }
        while (secim !=0);
}

    private static boolean mukemmelSayiKontrolu(int num) {
        if (num <= 1) {
            return false;
        }

        int toplam = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                toplam += i;
            }
        }

        return (toplam == num);
    }


    public static boolean asalSayiKontrolu(int sayi) {
    if (sayi <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(sayi); i++)
        if (sayi % i == 0) {
            return false;

        }

    return true;
}
public static void fibonacciSerisi(int n){
    int a = 0;
    int b = 1;

    for (int i = 1; i <= n; i++) {
        System.out.print(a + " ");

        int sum = a + b;
        a = b;
        b = sum;
    }
    System.out.println();

    }

}