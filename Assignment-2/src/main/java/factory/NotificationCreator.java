package factory;

public abstract class NotificationCreator  {

    public abstract Notification createNotification();

    public void notifyUser(String recipient, String message) {
        Notification notification = createNotification();
        notification.send(recipient, message);
    }
}
