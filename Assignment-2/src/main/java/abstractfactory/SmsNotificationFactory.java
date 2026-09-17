package abstractfactory;

import abstractfactory.formatter.NotificationFormatter;
import abstractfactory.formatter.SmsNotificationFormatter;
import abstractfactory.sender.NotificationSender;
import abstractfactory.sender.SmsNotificationSender;
import abstractfactory.validator.NotificationValidator;
import abstractfactory.validator.SmsNotificationValidator;

public class SmsNotificationFactory implements NotificationFactory {
    @Override
    public NotificationFormatter createFormatter() {
        return new SmsNotificationFormatter();
    }

    @Override
    public NotificationSender createSender() {
        return new SmsNotificationSender();
    }

    @Override
    public NotificationValidator createValidator() {
        return new SmsNotificationValidator();
    }
}
