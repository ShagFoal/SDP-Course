# Multi-Channel Notification System

This project uses Factory Method and Abstract Factory patterns to create notifications.

## Classes

### Factory Method

- Notification is the common interface for notifications.
- EmailNotification, SmsNotification and PushNotification send different types of notifications.
- NotificationCreator contains common notification logic.
- EmailNotificationCreator, SmsNotificationCreator and PushNotificationCreator create concrete notifications.

### Abstract Factory

- NotificationFactory creates a family of notification objects.
- NotificationSender sends a notification.
- NotificationFormatter formats a message.
- NotificationValidator checks the recipient.
- EmailNotificationFactory creates Email products.
- SmsNotificationFactory creates SMS products.
- NotificationService uses validator, formatter and sender together.

## How to run

Open the project in IntelliJ IDEA.

Set the project JDK and run Main.java.

The program shows examples of Factory Method and Abstract Factory.

## Clean Code

The "Before" examples show possible bad code, not actual earlier versions.

### 1. Clear names

Before:

```java
public interface Service {
    void doSomething(String a, String b);
}
```

After:

```java
public interface NotificationSender {
    void send(String recipient, String message);
}
```

The new names clearly show what the class, method and parameters do.

### 2. Small methods

Before:

```java
public void processNotification(String recipient, String message) {
    // Validate recipient.
    // Format message.
    // Send notification.
}
```

After:

```java
boolean isValidRecipient(String recipient);

String format(String message);

void send(String recipient, String message);
```

Each method has one small and clear task.

### 3. Each class has one job

Before:

```java
public class EmailNotification {
    // Validate recipient.
    // Format message.
    // Send notification.
}
```

After:

```java
EmailNotificationValidator
EmailNotificationFormatter
EmailNotificationSender
```

Validation, formatting and sending are separated into different classes.

Each class has one responsibility.

### 4. Use interfaces instead of concrete classes

Before:

```java
EmailNotificationFactory factory =
        new EmailNotificationFactory();
```

After:

```java
NotificationFactory factory =
        new EmailNotificationFactory();
```

The code depends on the NotificationFactory interface.

We can replace EmailNotificationFactory with SmsNotificationFactory without changing the rest of the client code.

### 5. Separate object creation from client code

Before:

```java
EmailNotificationValidator validator =
        new EmailNotificationValidator();

EmailNotificationFormatter formatter =
        new EmailNotificationFormatter();

EmailNotificationSender sender =
        new EmailNotificationSender();
```

After:

```java
NotificationFactory factory =
        new EmailNotificationFactory();

NotificationService service =
        new NotificationService(factory);
```

The factory creates related objects.

The client does not need to create every concrete object manually.