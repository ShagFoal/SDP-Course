public class UserLifecycleEventPublisher extends DomainEventPublisher {

    public UserLifecycleEventPublisher(MessageTransport messageTransport) {
        super(messageTransport);
    }

    @Override
    public void publish(String eventType, String eventData) {
        String destination = "user-topic";
        String payload = "[USER] Event: " + eventType + ", Details: " + eventData;

        messageTransport.sendPayload(destination, payload);
    }
}