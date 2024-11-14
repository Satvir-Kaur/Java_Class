package Oct19.Inheritance;

public class BankMain {
    public static void main(String[] args) {
        Scotia scotia=new Scotia();
        BMO bmo=new BMO();
        RBC rbc=new RBC();
        PragraBank pragraBank=new PragraBank();
        double v = scotia.rateOfInterest();
        System.out.println(v);
        double v2 = bmo.rateOfInterest();
        System.out.println(v2);
        double v3 = rbc.rateOfInterest();
        System.out.println(v3);
        double v4 = pragraBank.rateOfInterest();
        System.out.println(v4);


    }
}
