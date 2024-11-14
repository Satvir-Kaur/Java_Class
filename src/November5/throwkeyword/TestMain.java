package November5.throwkeyword;

public class TestMain {
    public static void main(String[] args) {
        Test t = new Test();

        try {
            t.divide();
        }catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        System.out.println("hello1");
    }
}
