package Oct19.Inheritance.multilevel;

public class Vehicle {
    String color="Black";
    String brand="Audi";

    public void start(){
        System.out.println("Vehicle starts");
    }
    public void show(){
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
    }
}
