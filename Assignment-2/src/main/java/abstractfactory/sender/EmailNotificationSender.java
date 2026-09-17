package abstractfactory.sender;

public class EmailNotificationSender implements NotificationSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println(
                "Sending EMAIL to: " + recipient +
                        "\n" + message
        );
    }
}
