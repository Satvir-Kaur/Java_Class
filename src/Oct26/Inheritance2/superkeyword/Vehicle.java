package Oct26.Inheritance2.superkeyword;

public class Vehicle {
   public int fuelCapacity;
   public String color;

    /*public Vehicle() {
        System.out.println("Vehicle Constructor");
    }*/

   /* public Vehicle(int fuelCapacity, String color) {
        this.fuelCapacity = fuelCapacity;
        this.color = color;
    }*/

    public void show1()
    {
        System.out.println("Fuel Capacity: "+fuelCapacity);
        System.out.println("Color: "+color);
    }

}
