package OCT29.polymorphism;

public class FullTimeEmp extends Employee{


   private double salary;

    public FullTimeEmp(double salary) {
        this.salary = salary;
    }

    @Override
    public double CalculateSalary() {
        return salary;
    }
}
