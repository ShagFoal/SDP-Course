import abstractfactory.EmailNotificationFactory;
import abstractfactory.NotificationFactory;
import abstractfactory.NotificationService;
import abstractfactory.SmsNotificationFactory;
import factory.EmailNotificationCreator;
import factory.NotificationCreator;
import factory.SmsNotificationCreator;

public class Main {
    public static void main(String[] args) {

        // Part 1 — Factory Method
        NotificationCreator emailCreator = new EmailNotificationCreator();
        emailCreator.notifyUser(
                "user@gmail.com",
                "Factory Method: email notification"
        );

        NotificationCreator smsCreator = new SmsNotificationCreator();
        smsCreator.notifyUser(
                "+77001234567",
                "Factory Method: SMS notification"
        );


        // Part 2 — Abstract Factory
        NotificationFactory emailFactory = new EmailNotificationFactory();
        NotificationService emailService = new NotificationService(emailFactory);

        emailService.send(
                "user@gmail.com",
                "Abstract Factory: email notification"
        );


        NotificationFactory smsFactory = new SmsNotificationFactory();
        NotificationService smsService = new NotificationService(smsFactory);

        smsService.send(
                "+77001234567",
                "Abstract Factory: SMS notification"
        );
    }
}