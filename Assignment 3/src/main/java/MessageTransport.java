public interface MessageTransport {

    void sendPayload(String destination, String payload);
}
