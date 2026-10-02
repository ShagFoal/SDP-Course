public class Main {
    public static void main(String[] args) {
        MessageTransport kafka = new KafkaMessageTransport();
        MessageTransport rabbit = new RabbitMqMessageTransport();

        DomainEventPublisher userPublisher = new UserLifecycleEventPublisher(kafka);
        userPublisher.publish("REGISTER", "username=alex");

        userPublisher.setMessageTransport(rabbit);
        userPublisher.publish("LOGOUT", "username=alex");

        DomainEventPublisher orderPublisher = new OrderProcessingEventPublisher(rabbit);
        orderPublisher.publish("CREATED", "orderId=101");

        orderPublisher.setMessageTransport(kafka);
        orderPublisher.publish("PAID", "orderId=101");
    }
}