package November5.throwskeyword;

import java.io.StringReader;

public class TestMain {
    public static void main(String[] args) {
       try{
           Test.show();
       }catch(Exception e)
       {
           System.out.println(e);
       }

        System.out.println("After Exception");
    }
}
