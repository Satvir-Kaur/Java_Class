package November5;

public class Test2 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        //e.printStackTrace();
        }

               /* try
        {



            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }
        catch (Exception e) {
            System.out.println(e);;
        }*/
        System.out.println("After exception");


    }
}
