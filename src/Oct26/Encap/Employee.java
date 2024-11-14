package Oct26.Encap;

public class Employee {

    public String name;
    public String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /*public String getName() {
        return name;
    }*/

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
    /* public void show()
    {
       System.out.println("Name: " + name);
       System.out.println("ID: " + id);
    }*/

}
