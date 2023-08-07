import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) throws IOException {
        Random rnd = new Random();
        String name = "";
        String code = "";
        Scanner input = new Scanner(System.in);
        System.out.println("kaç öğrenci");
        int ogrenci = input.nextInt();

        ArrayList<String> studentNames = new ArrayList<String>();
        ArrayList<String> studentGenders = new ArrayList<String>();

        File file = new File("src/Student.txt");
        Scanner scanner = new Scanner(file);
        String[] arr;
        int counter = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            counter++;
        }
        Scanner sc = new Scanner(file);
        arr = new String[counter];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        Gender.F.postFix(); //
        Gender.postFix("E"); // Bey Hanım

    }
    public enum Gender {
        M(" Bey"),
        F(" Hanım");

        private final String postFix;

        Gender(String postFix) {
            this.postFix = postFix;
        }

        public String postFix() {
            return postFix;
        }
        public static String postFix(String gender) {
            if (gender.equalsIgnoreCase("E")) {
                return Gender.M.postFix();
            } else if (gender.equalsIgnoreCase("K")) {
                return Gender.F.postFix();
            }
            return "Yanlış Harf";
        }
    }
}
