public class KafkaMessageTransport implements MessageTransport{
    @Override
    public void sendPayload(String destination, String payload) {
        System.out.println("Kafka message sended to " + destination +
                 "with payload{" + payload + "}");
    }

}
