import java.util.Scanner;

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

enum BookType {
    FICTION("Fiction"),
    NON_FICTION("Non-Fiction"),
    SCIENTIFIC("Scientific"),
    // Diğer kitap türleri buraya eklenebilir
    ;

    private final String description;

    BookType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

class Book {
    private Author author;
    private String title;
    private int pageCount;
    private BookType type;
    // private boolean hardCover;
    private int currentPage;

    public Book(Author author, String title, int pageCount, BookType type) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.type = type;
        // this.hardCover = hardCover;
        this.currentPage = 0;
    }

    // Diğer metotlar ve özellikler
    // ...

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public BookType getType() {
        return type;
    }

    /*public boolean isHardCover() {
        return hardCover;
    }*/

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        if (currentPage >= 0 && currentPage <= pageCount) {
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
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void read(Book book) {
        System.out.println(name + " is reading " + book.getTitle() + " by " + book.getAuthor().getName());

        // Simulating reading by incrementing current page
        for (int i = book.getCurrentPage(); i < book.getPageCount(); i++) {
            book.setCurrentPage(i);
            System.out.println(name + " is on page " + book.getCurrentPage());
        }

        System.out.println(name + " finished reading " + book.getTitle());
    }
}

public class ReaderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Yazarın adını girin: ");
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

        System.out.println("2. Yazarın adını girin: ");
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

        System.out.println("1. okuyucunun adını girin: ");
        String name1 = scanner.nextLine();
        System.out.println("1. okuyucunun yaşını girin: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("1. okuyucunun cinsiyetini girin: ");
        String sex1 = scanner.nextLine();
        Reader reader1 = new Reader(name1, age1, sex1);

        System.out.println("2. okuyucunun adını girin: ");
        String name2 = scanner.nextLine();
        System.out.println("2. okuyucunun yaşını girin: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("2. okuyucunun cinsiyetini girin: ");
        String sex2 = scanner.nextLine();
        Reader reader2 = new Reader(name2, age2, sex2);

        // Reader 1 kitap okuyor
        System.out.println("\n" + reader1.getName() + " için kitap seçin:");
        System.out.println("1. " + book1.getTitle());
        System.out.println("2. " + book2.getTitle());
        int choice1 = scanner.nextInt();
        scanner.nextLine();

        Book selectedBook1;
        if (choice1 == 1) {
            selectedBook1 = book1;
        } else if (choice1 == 2) {
            selectedBook1 = book2;
        } else {
            System.out.println("Geçerli bir seçenek giriniz.");
            return;
        }

        System.out.println("Okumaya başlamak için başlangıç sayfa numarasını girin (0 ile " + selectedBook1.getPageCount() + " arasında):");
        int startPage1 = scanner.nextInt();
        scanner.nextLine();
        selectedBook1.setCurrentPage(startPage1);

        reader1.read(selectedBook1);

        // Reader 2 kitap okuyor
        System.out.println("\n" + reader2.getName() + " için kitap seçin:");
        System.out.println("1. " + book1.getTitle());
        System.out.println("2. " + book2.getTitle());
        int choice2 = scanner.nextInt();
        scanner.nextLine();

        Book selectedBook2;
        if (choice2 == 1) {
            selectedBook2 = book1;
        } else if (choice2 == 2) {
            selectedBook2 = book2;
        } else {
            System.out.println("Geçerli bir seçenek giriniz.");
            return;
        }

        System.out.println("Okumaya başlamak için başlangıç sayfa numarasını girin (0 ile " + selectedBook2.getPageCount() + " arasında):");
        int startPage2 = scanner.nextInt();
        scanner.nextLine();
        selectedBook2.setCurrentPage(startPage2);

        reader2.read(selectedBook2);
        scanner.close();
    }
}
