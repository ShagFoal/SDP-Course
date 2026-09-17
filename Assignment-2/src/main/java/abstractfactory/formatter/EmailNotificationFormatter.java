package abstractfactory.formatter;

public class EmailNotificationFormatter implements NotificationFormatter {

    @Override
    public String format(String message) {
        return "FORMAT EMAIL".formatted(message);
    }
}