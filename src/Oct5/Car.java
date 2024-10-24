package Oct5;

public class Car {

    int speed;
    int seats;
    String Model;

    Car(){
        System.out.println("Car Default Constructor");

    }

    Car(int speed, int seats, String Model){

        this.speed = speed;
        this.seats = seats;
        this.Model = Model;

    }
    Car(int speed, int seats){

        this.speed = speed;
        this.seats = seats;}


}
