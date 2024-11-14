package Oct26.Inheritance2.superkeyword;

public class Book {
    private String genre;
    private String title;

    public Book(String genre, String title) {
        this.genre = genre;
        this.title = title;
    }
    public void showBook(){
        System.out.println(genre + " " + title);
    }
}
