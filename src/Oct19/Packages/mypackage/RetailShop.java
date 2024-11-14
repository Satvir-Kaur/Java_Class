package Oct19.Packages.mypackage;


import Oct19.Packages.summer.SummerSale;
import Oct19.Packages.winter.WinterSale;

public class RetailShop {
    public static void main(String[] args) {
        SummerSale summerSale = new SummerSale();
        //WinterSale winterSale = new WinterSale();
        String offer = summerSale.offer();
        System.out.println(offer);
        String offer1 = WinterSale.offer();
        System.out.println(offer1);
        String s1 = summerSale.show2();
        System.out.println(s1);


    }
}
