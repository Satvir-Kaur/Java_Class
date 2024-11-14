package Oct26.Encap.googlesheet;

public class GoogleSheetMain {
    public static void main(String[] args) {


        GoogleSheet1 g1 = new GoogleSheet1();
        String t1 = g1.getTitle();
        System.out.println(t1);
        g1.setTitle("Change G1");

        GoogleSheet2 g2= new GoogleSheet2();
       String t2= g2.getTitle();
       System.out.println(t2);
       g2.setTitle("I have been modified");
        String t3 = g2.getTitle();
        System.out.println(t3);

       GoogleSheet3 g3= new GoogleSheet3();
       g3.setTitle(" write only");
        String t4 = g3.getTitle();
        System.out.println(t4);

    }
}
