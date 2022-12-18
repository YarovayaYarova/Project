package lesson2;

public class Book {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.createNewBook("Harry Potter", "J.K.Rowling", 1, 10.5, false);

    }
    public void createNewBook (String bookName, String authorName, int id, double priceInUSD, boolean isAvailable){
        double rate = 1.1;
        double priceInEUR = priceInUSD * rate;

        System.out.println("Book name is " + bookName);
        System.out.println("Book ID is " + id);
        System.out.println("Book price is " + priceInUSD + " USD " + priceInEUR + " EUR ");
        System.out.println("Book is available " + isAvailable);

        }

    }

