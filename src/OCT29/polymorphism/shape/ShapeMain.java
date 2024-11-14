package OCT29.polymorphism.shape;

public class ShapeMain {

    public static void main(String[] args) {
        Shape shape= new Rectangle(10, 20);
        double area1 = shape.getArea();// UPCASTING, RUNTIME POLYMORPHISM
        System.out.println("Area of rectangle is:" + area1);
        Shape shape1= new Circle(5);
    }
}
