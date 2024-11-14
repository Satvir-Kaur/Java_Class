package Oct19.Inheritance;

public class Scotia extends BankOfCanada{

    @Override
    public double rateOfInterest() {
        return super.rateOfInterest() + 1.25;
    }
}
