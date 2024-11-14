package Oct26.Inheritance2.superkeyword;

public class Fiction extends Book{
    String title;
    String author;

    public Fiction(String title, String author) {
        super("Programming", "Python");
        this.title = title;
        this.author = author;
    }

    void showFictionBookDetails()
    {
      System.out.println("Title: " + title);
      System.out.println("Author: " + author);
    }
}
