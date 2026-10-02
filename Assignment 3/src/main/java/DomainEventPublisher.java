public abstract class  DomainEventPublisher {
    protected MessageTransport messageTransport;

    public DomainEventPublisher(MessageTransport messageTransport) {
        this.messageTransport = messageTransport;
    }

    public void setMessageTransport(MessageTransport messageTransport) {
        this.messageTransport = messageTransport;
    }

    public abstract void publish(String eventType, String eventData);
}
