package Oct19.Inheritance;

public class BMO extends BankOfCanada{

    @Override
    public double rateOfInterest() {
        return super.rateOfInterest() + 1.55;
    }
}
