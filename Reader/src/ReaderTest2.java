import java.util.Scanner;

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Book {
    private Author author;
    private String title;
    private int pageCount;
    private String type;
    // private boolean hardCover;
    private int currentPage;

    public Book(Author author, String title, int pageCount, String type, boolean hardCover) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.type = type;
        //  this.hardCover = hardCover;
        this.currentPage = 0;
    }

    public Book(Author author1, String bookTitle1, int pageCount1, String bookType1) {
        this.author = author1;
        this.title = bookTitle1;
        this.pageCount = pageCount1;
        this.type = bookType1;
        this.currentPage = 0;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public String getType() {
        return this.type;
    }

    /*public boolean isHardCover() {
        return hardCover;
    }*/

    public int getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(int currentPage) {
        if (currentPage >= 0 && currentPage <= this.pageCount) {
            this.currentPage = currentPage;
        } else {
            System.out.println("Geçerli bir sayfa numarası giriniz.");
        }
    }
}

class Reader {
    private String name;
    private int age;
    private String sex;

    public Reader(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSex() {
        return this.sex;
    }

    public void read(Book book) {
        System.out.println(this.name + " is reading " + book.getTitle() + " by " + book.getAuthor().getName());

        // Simulating reading by incrementing current page
        for (int i = book.getCurrentPage(); i < book.getPageCount(); i++) {
            book.setCurrentPage(i);
            System.out.println(this.name + " is on page " + book.getCurrentPage());
        }

        System.out.println(this.name + " finished reading " + book.getTitle());
    }
}

public class ReaderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Author'ın adını girin: ");
        String authorName1 = scanner.nextLine();
        Author author1 = new Author(authorName1);

        System.out.println("1. Kitabın adını girin: ");
        String bookTitle1 = scanner.nextLine();
        System.out.println("1. Kitabın sayfa sayısını girin: ");
        int pageCount1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("1. Kitabın türünü girin: ");
        String bookType1 = scanner.nextLine();
       /* System.out.println("1. Kitabın ciltli mi olduğunu belirtin (true/false): ");
        boolean hardCover1 = scanner.nextBoolean();
        scanner.nextLine();*/

        Book book1 = new Book(author1, bookTitle1, pageCount1, bookType1);
        System.out.println("2. Author'ın adını girin: ");
        String authorName2 = scanner.nextLine();
        Author author2 = new Author(authorName2);

        System.out.println("2. Kitabın adını girin: ");
        String bookTitle2 = scanner.nextLine();
        System.out.println("2.Kitabın sayfa sayısını girin: ");
        int pageCount2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("2. Kitabın türünü girin: ");
        String bookType2 = scanner.nextLine();
   /* System.out.println("2. Kitabın ciltli mi olduğunu belirtin (true/false): ");
    boolean hardCover2 = scanner.nextBoolean();
    scanner.nextLine();*/
        Book book2 = new Book(author2, bookTitle2, pageCount2, bookType2);

        System.out.println("1. Reader'ın adını girin: ");
        String name1 = scanner.nextLine();
        System.out.println("1. Reader'ın yaşını girin: ");
        int age1 = scanner.nextInt();
