package Oct26.Encap.employee;

public class Employee {

    String name;
    int id;
    String email;
    Address address;


    public Employee(String name, int id, String email, Address address) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.address = address;
    }

    public void display()
    {
        System.out.println(name + " " +id +" "+ email + " " + address.toString());
    }
}
