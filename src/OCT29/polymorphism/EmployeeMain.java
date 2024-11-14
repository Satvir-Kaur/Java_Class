package OCT29.polymorphism;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee= new FullTimeEmp(13000);
        double s1 = employee.CalculateSalary();
        System.out.println( "Full Time Employee Salary is ;" +s1);

        Employee employee2= new PartTimeEmp(16, 6);
        double s2 = employee2.CalculateSalary();
        System.out.println( "Part Time Employee Salary is ;" +s2);

        Employee employee3= new Contract(16, 180, 5);
        double s3 = employee3.CalculateSalary();
        System.out.println( "Contract Employee Salary is ;" +s3);


    }
}
