import java.util.ArrayList;
import java.util.List;

public class Kitap {
    private static Kitap instance;
    private static List<Kitap> kitaplar = new ArrayList<>();


    private String kitapAdi;
    private String yazar;
    private int sayfaSayisi;


    private Kitap(String kitapAdi, String yazar, int sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
    }

    public static Kitap getInstance() {
        if (instance == null) {
            instance = new Kitap("Default Kitap Adı", "Default Yazar", 0);
            kitaplar.add(instance);
        }
        return instance;
    }

    public static List<Kitap> getKitaplar() {
        return kitaplar;
    }



    public static void main(String[] args) {
        Kitap kitap1 = Kitap.getInstance();
        kitap1.setKitapAdi("Java Programming");
        kitap1.setYazar("John Doe");
        kitap1.setSayfaSayisi(400);

        Kitap kitap2 = Kitap.getInstance();
        kitap2.setKitapAdi("Python Basics");
        kitap2.setYazar("Jane Smith");
        kitap2.setSayfaSayisi(250);

       
        System.out.println("Toplam Kitap Sayısı: " + kitaplar.size());
        for (Kitap kitap : kitaplar) {
            kitap.kitabiGoster();
            System.out.println("---------------------");
        }
    }

    public void kitabiGoster() {
        System.out.println("Kitap Adı: " + kitapAdi);
        System.out.println("Yazar: " + yazar);
        System.out.println("Sayfa Sayısı: " + sayfaSayisi);
    }
    public static void setInstance(Kitap instance) {
        Kitap.instance = instance;
    }

    public static void setKitaplar(List<Kitap> kitaplar) {
        Kitap.kitaplar = kitaplar;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }
}
