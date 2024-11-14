package Oct26.Inheritance2.superkeyword;

public class Car extends Vehicle{

    public int fuelCapacity=50;

    public Car(int fuelCapacity) {
       // super(100,"red");

        this.fuelCapacity = fuelCapacity;
    }


    /*public Car() {
        System.out.println("Car Constructor");
    }*/

    public void show()
    {     //super.show();
        System.out.println("Car Fuel Capacity: "+fuelCapacity);

    }
}
