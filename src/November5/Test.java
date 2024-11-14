package November5;

public class Test {
    public static void main(String[] args)
    {
        try
        {
            try {
                int a= 10;
                int b=0;
                int div=a/b;
                System.out.println(div);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            String s = "Pragra";
            s = null;
            System.out.println(s.toLowerCase());
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }


        //System.out.println("Hii");
        finally{
        System.out.println("I am finally block");}
        try
        {
            int a=10;
            String s= "Savi";

        }
        catch(NumberFormatException e)
        {
            e.printStackTrace();
    }
        System.out.println("Hii again");

    }
}
