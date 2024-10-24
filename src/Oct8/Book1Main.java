package Oct8;

public class Book1Main {

    public static void main(String args[])
    {
        Book1 b1=new Book1();
        Book1 b2=new Book1("Java Oct5.Book");
        Book1 b3=new Book1("Java Oct5.Book", "ABC");
        System.out.println(b1.title+ " " + b1.author);
        System.out.println(b2.title+ " " + b2.author);
        System.out.println(b3.title+ " " + b3.author);

    }
}
