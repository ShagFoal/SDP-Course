package factory;

public class EmailNotification implements Notification{
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sent email notification with message={" + message + "}\n"
                + "to " + recipient);
    }
}
