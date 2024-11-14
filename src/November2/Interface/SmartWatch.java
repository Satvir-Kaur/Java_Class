package November2.Interface;

public class SmartWatch implements MobilePhone, Calculator, WebBrowser {
    @Override
    public void calculate() {
        System.out.println("SmartWatch calculate");

    }

    @Override
    public void call() {
        System.out.println("Calling from SMartWatch");

    }

    @Override
    public void text() {
        System.out.println("Text from SmartWatch");

    }

    @Override
    public void surfInternet() {
     System.out.println("Surfing Internet from SmartWatch");
    }
}
