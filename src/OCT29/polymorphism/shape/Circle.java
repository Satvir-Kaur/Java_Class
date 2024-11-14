package OCT29.polymorphism.shape;

public class Circle extends Shape{

    final float PI= 3.14f;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI* radius * radius;
    }

    public void show()
    {
        System.out.println("Hii");
    }
}
