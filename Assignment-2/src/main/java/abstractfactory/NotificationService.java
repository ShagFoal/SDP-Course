package abstractfactory;

import abstractfactory.formatter.NotificationFormatter;
import abstractfactory.sender.NotificationSender;
import abstractfactory.validator.NotificationValidator;

public class NotificationService {

    private NotificationValidator notificationValidator;
    private NotificationFormatter notificationFormatter;
    private NotificationSender notificationSender;

    public NotificationService(NotificationFactory factory) {
        this.notificationFormatter = factory.createFormatter();
        this.notificationSender = factory.createSender();
        this.notificationValidator = factory.createValidator();
    }

    public void send (String recipient, String message) {
        if (!notificationValidator.isValidRecipient(recipient)) {
            throw new IllegalArgumentException("Invalid recipient");
        }

        String formattedMessage = notificationFormatter.format(message);

        notificationSender.send(recipient, formattedMessage);
    }
}
