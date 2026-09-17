package abstractfactory;

import abstractfactory.formatter.EmailNotificationFormatter;
import abstractfactory.formatter.NotificationFormatter;
import abstractfactory.sender.EmailNotificationSender;
import abstractfactory.sender.NotificationSender;
import abstractfactory.validator.EmailNotificationValidator;
import abstractfactory.validator.NotificationValidator;

public class EmailNotificationFactory implements NotificationFactory{

    @Override
    public NotificationFormatter createFormatter() {
       return new EmailNotificationFormatter();
    }

    @Override
    public NotificationSender createSender() {
        return new EmailNotificationSender();
    }

    @Override
    public NotificationValidator createValidator() {
        return new EmailNotificationValidator();
    }
}
