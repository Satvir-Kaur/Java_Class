package November5.FinalizeMethod;

public class Demo {

     @Override
    protected void finalize() throws Throwable
    { try{
        System.out.println("i am inside demo class finalize method");}
       // super.finalize();
    catch (RuntimeException e) {
        System.out.println(e);
    }
    }




}
