package OCT29.polymorphism;

public class PartTimeEmp extends Employee{

    private double hourlySalary;
    private double noOfHours;

    public PartTimeEmp(double hourlySalary, double noOfHours) {
        this.hourlySalary = hourlySalary;
        this.noOfHours = noOfHours;
    }

    @Override
    public double CalculateSalary() {
        return hourlySalary * noOfHours;
    }
}
