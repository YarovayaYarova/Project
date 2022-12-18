package bookStoreOOP;

public class booksStoreMain {
    public static void main(String[] args) {
        AudioBook book1 = new AudioBook("Harry Potter", "J.K.Rowling", 1, 10.5, false, "MP3", 128, "Smith");
        book1.printBookDetails();
        EBook book2 = new EBook("Anna Karenina", "L. Tolstoy", 2, 28, true, "www");
        book2.printBookDetails();
        book2.setUsdPrise(18);
//        book1.printBookDetails();
//        book2.printBookDetails();
//        book1.setAvailable(true);
//        book2.setUsdPrise(30);
    }
}
