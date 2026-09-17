package factory;

public class SmsNotification implements Notification{
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sent sms notification with message={" + message + "}\n"
                + "to " + recipient);
    }
}
