package basic.c08oop.polimorphism.models.notification;

public class SMSNotification extends Notification{
    @Override
    public void send() {
        System.out.println("SMS enviado");
    }
}
