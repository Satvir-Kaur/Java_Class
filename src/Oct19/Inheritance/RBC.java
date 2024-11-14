package Oct19.Inheritance;

public class RBC extends BankOfCanada{
    @Override
    public double rateOfInterest() {
            return super.rateOfInterest() +2.10;
    }
}
