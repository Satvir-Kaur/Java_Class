package Oct8;

public class Book1 {
    String title;
    String author;

     Book1()
     {
         title="unknown";
         author="unknown";

     }
    Book1(String title) {
        this();
        this.title = title;

    }


    Book1(String title, String author) {
         this(title);
        //this.title = title;
        this.author = author;
    }

}