package factory;

public class PushNotificationCreator extends NotificationCreator{
    private PushNotification pushNotification;

    @Override
    public Notification createNotification() {
        this.pushNotification = new PushNotification();
        return pushNotification;
    }
}
