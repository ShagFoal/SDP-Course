package abstractfactory.validator;

public class SmsNotificationValidator implements NotificationValidator {

    @Override
    public boolean isValidRecipient(String recipient) {
        return recipient != null
                && recipient.startsWith("+");
    }
}