package Oct8;

public class StaticBlock {


    public static void test(){

        System.out.println("This is static method");
    }
     public void test1() {
        System.out.println("This is non static method");
     }

     static{
        System.out.println("This is static BLock");

     }
    {
        System.out.println("This is instance BLock");
    }
    public StaticBlock(){
        System.out.println("This is a constructor");
    }

    public static void main(String[] args) {

        StaticBlock s = new StaticBlock();
         StaticBlock.test();
         s.test1();


    }
}
