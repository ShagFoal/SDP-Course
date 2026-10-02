public class RabbitMqMessageTransport implements MessageTransport{
    @Override
    public void sendPayload(String destination, String payload) {
        System.out.println("Sended via RabbitMq to " + destination +
                "with payload{" + payload + "}");
    }
}
