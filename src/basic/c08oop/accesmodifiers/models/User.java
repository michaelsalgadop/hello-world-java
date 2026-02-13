package basic.c08oop.accesmodifiers.models;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean checkPassword (String inputPassword) {
        return password.equals(inputPassword);
    }
}
