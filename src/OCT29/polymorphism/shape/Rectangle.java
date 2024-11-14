package OCT29.polymorphism.shape;

public class Rectangle extends Shape{

    private double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    /* @Override
    public double getArea() {
        return length * breadth;
    } */
     public double area()
     {
         return length * breadth;
     }
}
