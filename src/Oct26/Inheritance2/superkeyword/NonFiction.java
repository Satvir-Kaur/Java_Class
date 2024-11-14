package Oct26.Inheritance2.superkeyword;

public class NonFiction extends Book{

    int price;

    public NonFiction(int price) {
        super("Programming", "C++");
        this.price = price;
    }

    public void showNonFiction()
    {
        System.out.println(price);
    }
}
