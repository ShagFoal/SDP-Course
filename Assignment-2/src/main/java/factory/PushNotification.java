package factory;

public class PushNotification implements Notification{
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sent push notification with message={" + message + "}\n"
                + "to " + recipient);
    }
}
