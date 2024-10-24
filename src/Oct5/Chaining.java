package Oct5;

public class Chaining {
    int x,y;
    public Chaining()
    {
        System.out.println("Default constructor");

    }
    public Chaining(int x)
    {
        this();
        System.out.println("One Parameter constructor");
        this.x = x;
    }
    public Chaining(int x, int y)
    {
        this(x);
        System.out.println("Two Parameters constructor");
        //this();
        this.x = x;
        this.y=y;
    }

    public static void main(String[] args) {

        Chaining chain = new Chaining(10,20);
         System.out.println(chain.x);
         System.out.println(chain.y);
    }
}
