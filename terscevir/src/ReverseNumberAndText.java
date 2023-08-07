import java.util.Scanner;

public class ReverseNumberAndText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sayının rakamlarını tersten yazan program
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        // StringBuilder kullanarak çözüm
        String reversedNumberWithSB = reverseNumberWithStringBuilder(number);
        System.out.println("StringBuilder ile ters çevrilmiş sayı: " + reversedNumberWithSB);

        // String API'sini kullanarak çözüm
        String reversedNumberWithoutSB = reverseNumberWithoutStringBuilder(number);
        System.out.println("String API'si ile ters çevrilmiş sayı: " + reversedNumberWithoutSB);

        // Metin bloğunu tersten yazan program
        scanner.nextLine(); // Boş satırı tüket
        System.out.print("Bir metin bloğu girin: ");
        String text = scanner.nextLine();

        // StringBuilder kullanarak çözüm
        String reversedTextWithSB = reverseTextWithStringBuilder(text);
        System.out.println("StringBuilder ile ters çevrilmiş metin: " + reversedTextWithSB);

        // String API'sini kullanarak çözüm
        String reversedTextWithoutSB = reverseTextWithoutStringBuilder(text);
        System.out.println("String API'si ile ters çevrilmiş metin: " + reversedTextWithoutSB);
    }

    // Sayının rakamlarını tersten yazan program - StringBuilder kullanarak çözüm
    public static String reverseNumberWithStringBuilder(int number) {
        return new StringBuilder(String.valueOf(number)).reverse().toString();
    }

    // Sayının rakamlarını tersten yazan program - String API'sini kullanarak çözüm
    public static String reverseNumberWithoutStringBuilder(int number) {
        String numStr = String.valueOf(number);
        int length = numStr.length();
        StringBuilder reversed = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(numStr.charAt(i));
        }

        return reversed.toString();
    }

    // Metin bloğunu tersten yazan program - StringBuilder kullanarak çözüm
    public static String reverseTextWithStringBuilder(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // Metin bloğunu tersten yazan program - String API'sini kullanarak çözüm
    public static String reverseTextWithoutStringBuilder(String text) {
        int length = text.length();
        StringBuilder reversed = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        return reversed.toString();
    }
}
