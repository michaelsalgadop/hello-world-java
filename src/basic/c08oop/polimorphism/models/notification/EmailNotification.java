package basic.c08oop.polimorphism.models.notification;

public class EmailNotification extends Notification{
    @Override
    public void send() {
        System.out.println("Email enviado");
    }
}
