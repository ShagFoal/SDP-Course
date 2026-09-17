package factory;

public class EmailNotificationCreator extends NotificationCreator{
    private EmailNotification emailNotification;

    @Override
    public Notification createNotification() {
        emailNotification = new EmailNotification();
        return emailNotification;
    }
}
