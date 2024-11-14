package Oct26.Encap;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Savi", "Madahar");
        String id = employee.getId();
        //String name = employee.getName();
        System.out.println("ID: " + id);
        //System.out.println("Name: " + name);
        employee.setId("Arsh");
        System.out.println(employee.toString());

        ;

    }
}
