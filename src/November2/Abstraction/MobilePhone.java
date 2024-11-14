package November2.Abstraction;

public class MobilePhone extends Phone {
    @Override
    public void makeCalls() {
        System.out.println("Calling from mobile phone");

    }

    @Override
    public void receiveCalls() {
        System.out.println("Receiving calls from mobile phone");

    }

    @Override
    public void leaveVoiceMails() {
        System.out.println("Leaving voice mails from mobile phone");

    }
    /*public abstract void playGames();
    public abstract void sendTextMessages();
    public abstract void storeContacts();*/
}
