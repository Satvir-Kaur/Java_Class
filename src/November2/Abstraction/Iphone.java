package November2.Abstraction;

public class Iphone extends SmartPhone{

    public void airDrop() {
        System.out.println("Air Drop in IPhone");
    }

    @Override
    public void authentication() {
        System.out.println("Face ID Authentication in IPhone");

    }
}

