package abstractfactory;

import abstractfactory.formatter.NotificationFormatter;
import abstractfactory.sender.NotificationSender;
import abstractfactory.validator.NotificationValidator;

public interface NotificationFactory {

    NotificationFormatter createFormatter();
    NotificationSender createSender();
    NotificationValidator createValidator();
 }
