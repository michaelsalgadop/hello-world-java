package basic.c09_exceptions.classes.login;

import basic.c09_exceptions.exceptions.LoginFailedException;

public class LoginSystem {
    final private String username = "hola";
    final private String password = "hola";
    public void checkUser(String username,String password) throws LoginFailedException{
        if (username == this.username && password == this.password) {
            System.out.println("Usuario correcto!");
        } else {
            throw new LoginFailedException("Usuario incorrecto!");
        }
    }
}
