package November2.Abstraction;

public abstract class SmartPhone extends MobilePhone {
    @Override
    public void makeCalls() {
        System.out.println("Calling from SmartPhone");
    }

    @Override
    public void receiveCalls() {
        System.out.println("SmartPhone Receiving Calls");
    }

    @Override
    public void leaveVoiceMails() {
        System.out.println("Leaving Voice Mails from SmartPhone");

    }


    public abstract void authentication();
}
