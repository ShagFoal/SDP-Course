public class OrderProcessingEventPublisher extends DomainEventPublisher {

    public OrderProcessingEventPublisher(MessageTransport messageTransport) {
        super(messageTransport);
    }

    @Override
    public void publish(String eventType, String eventData) {
        String destination = "orders-queue";
        String payload = "[ORDER] Status: " + eventType + ", Info: " + eventData;

        messageTransport.sendPayload(destination, payload);
    }
}