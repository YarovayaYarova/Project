package stringsLesson;

public class Book {
    String euro = "EUR";
    String ruble = "RUB";
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.createNewBook("Harry Potter", "J.K.Rowling", 1, 10.5, false);

    }
    public void createNewBook (String bookName, String authorName, int id, double priceInUSD, boolean isAvailable){


        double priceInEUR = calculatePrice(priceInUSD, euro);
        double priceInRubles = calculatePrice(priceInUSD, ruble);
        System.out.println("Book name is " + bookName);
        System.out.println("Book ID is " + id);
        System.out.println("Book price is " + priceInUSD + " USD " + priceInEUR + " EUR " + priceInRubles + " RUB");
        System.out.println("Book is available " + isAvailable);

        }
        public double calculatePrice (double priceInUSD, String currency) {
        double rate=1;
        if (currency.equals(euro)){
            rate = 1.1;
        }
        else if (currency.equals(ruble)){
            rate = 70;
        }
        else {
            System.out.println("Error unknown currency, USD price will be return");
        }
            double priceAfterConversion = priceInUSD * rate;
        return priceAfterConversion;
        }

    }

