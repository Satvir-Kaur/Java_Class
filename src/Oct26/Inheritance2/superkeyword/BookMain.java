package Oct26.Inheritance2.superkeyword;

public class BookMain {
    public static void main(String[] args) {

        Fiction fiction = new Fiction("Java_Programming", "ABC");
       //Book book= new Book("Programming", "C++");
        NonFiction nonfiction = new NonFiction(500);
        fiction.showFictionBookDetails();
        nonfiction.showNonFiction();
        fiction.showBook();
    }
}
