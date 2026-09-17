package abstractfactory.formatter;

public class SmsNotificationFormatter implements NotificationFormatter{
    @Override
    public String format(String message) {
        return "SMS Format".formatted(message);
    }
}
