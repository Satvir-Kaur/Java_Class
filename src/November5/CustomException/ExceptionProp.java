package November5.CustomException;

public class ExceptionProp {

    public static void main(String[] args) {
        test1();

    }

    public static void test1()
    {
        test2();

    }
    public static void test2()
    {
      test3();
    }
    public static void test3()
    {
       test4();
        System.out.println("after exception");
    }
    public static void test4()
    {try {
        int x = 10;
        int y = 0;
        int div = x / y;
        System.out.println(div);
    }
    catch (ArithmeticException e){
        e.printStackTrace();
    }

    }
}
