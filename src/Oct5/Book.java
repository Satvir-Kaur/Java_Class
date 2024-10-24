package Oct5;

public class Book {

    String title;
    String author;
    int yearOfPublication;
    float price;
    String genre;


    public Book(){

        System.out.println("Book Default Constructor Called");
    }
    public Book(String title, String author, int yearOfPublication, float price, String genre)
    {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.price = price;
        this.genre = genre;


    }

    public Book(String title, String author, int yearOfPublication, float price) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.price = price;
    }

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public Book(String title) {
        this.title = title;
    }

    /*public static void display() {
        System.out.println("Hii");
    }*/

    public  void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of publication: " + yearOfPublication);
        System.out.println("Price: " + price);
        System.out.println("Genre: " + genre);

    }
}
