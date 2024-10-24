package OCt15;

public class ToStringDemo {

    int id;
    String name;
    double salary;

    public ToStringDemo(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);

    }

    @Override
    public String toString() {
        return "ToStringDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';

    }
}
