package Oct5;

public class BookMain {

    public static void main(String[] args) {
       Book book=new Book("Java_Programming", "Thomas", 2016, 50, "java");
       Book book1=new Book();
       Book book2=new Book("Java Programming", "Thomas", 2017, 50);
       Book book3=new Book("Java_Programming", "Thoams", 2018);
       Book book4=new Book("Java_Programming", "Thoams");
       Book book5=new Book("Java_Programming");
       //System.out.println(book);
       /* System.out.println(book.author+" "+book.title+" "+book.yearOfPublication+" "+book.price+" "+book.genre);
        System.out.println(book1.title);
        System.out.println(book2.yearOfPublication);
        System.out.println(book3.title);
        System.out.println(book4.price);
        System.out.println(book5.genre); */
        book.display();
        System.out.println("\n\n");
        book1.display();System.out.println("\n\n");
        book2.display();System.out.println("\n\n");
        book3.display();System.out.println("\n\n");
        book4.display();System.out.println("\n\n");
        book5.display();System.out.println("\n\n");




    }
}