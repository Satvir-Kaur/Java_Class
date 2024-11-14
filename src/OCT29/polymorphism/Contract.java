package OCT29.polymorphism;

public class Contract  extends Employee{

    private double hourlySalary;
    //private double daysOfContract;
    private double hoursPerDay;

    public Contract(double hourlySalary, double daysOfContract, double hoursPerDay) {
        this.hourlySalary = hourlySalary;
        //this.daysOfContract = daysOfContract;
        this.hoursPerDay = hoursPerDay;
    }

    @Override
    public double CalculateSalary() {
        return hourlySalary * hoursPerDay;
    }
}
