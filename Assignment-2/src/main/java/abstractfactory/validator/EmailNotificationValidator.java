package abstractfactory.validator;

public class EmailNotificationValidator implements NotificationValidator {

    @Override
    public boolean isValidRecipient(String recipient) {
        return recipient != null
                && recipient.contains("@")
                && recipient.contains(".");
    }
}
