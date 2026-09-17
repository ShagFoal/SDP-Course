package factory;

public class SmsNotificationCreator extends NotificationCreator{
    private SmsNotification smsNotification;

    @Override
    public Notification createNotification() {
        smsNotification = new SmsNotification();
        return smsNotification;
    }
}
