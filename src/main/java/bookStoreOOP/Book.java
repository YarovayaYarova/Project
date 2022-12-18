package bookStoreOOP;

public abstract class Book {

    String bookName;
    String authorName;
    int id;
    double usdPrise;
    boolean isAvailable;
    String euro = "EUR";
    String ruble = "RUB";

    public Book(String name, String authorName, int id, double price, boolean isAvailable) {
        this.bookName = name;
        this.authorName = authorName;
        this.id = id;
        this.usdPrise = price;
        this.isAvailable = isAvailable;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getUsdPrise() {
        return usdPrise;
    }

    public void setUsdPrise(double usdPrise) {
        this.usdPrise = usdPrise;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double convertPrice(String currency) {
        double rate = 1;
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if (currency.equals(ruble)) {
            rate = 70;
        } else {
            System.out.println("Error unknown currency, USD price will be return");
        }
        double priceAfterConversion = usdPrise * rate;
        return priceAfterConversion;
    }
    public void printBookDetails(){
        System.out.println("************************");
        System.out.println("Book name is " + bookName);
        System.out.println("Book ID is " + id);
        System.out.println("Book price is " + usdPrise + " USD " + convertPrice(euro) + " EUR " + convertPrice(ruble) + " RUB");
        System.out.println("Book is available " + isAvailable);
    }
}
