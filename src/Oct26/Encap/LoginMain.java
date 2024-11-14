package Oct26.Encap;

public class LoginMain {
    public static void main(String[] args) {
        Login l=new Login("Savi", "12345");

        l.login("Savi", "12345");

        String username = l.getUsername();
        System.out.println(username);

        l.setPassword("12345678");
        l.login("Savi", "12345");

      /*  l.username="Nader";
      l.password="123456";
      l.show("Nader", "123456"); */

    }
}
