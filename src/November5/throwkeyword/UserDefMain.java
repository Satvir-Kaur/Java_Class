package November5.throwkeyword;

public class UserDefMain {

    public static void main(String[] args) {
        show();
    }

    public static void show() {
        try {
            throw new UserDefException("This is user defined exception");
        } catch (UserDefException e) {

            System.out.println(e);
            ;
        }
    }

}