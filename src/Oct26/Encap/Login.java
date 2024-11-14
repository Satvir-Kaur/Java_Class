package Oct26.Encap;

public class Login {
    private String username, password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(String username, String password)
    { if(this.username.equals(username) && this.password.equals(password)) {
        System.out.println("Login successful");
    }
    else {
        System.out.println("Login failed");
    }

    }

    }



