public class Producer {
    private Exchange exchange;

    public Producer(Exchange exchange) {
        this.exchange = exchange;
    }

    public void produce(String message) {
        exchange.publish(message);
    }

    public Exchange getExchange() {
        return exchange;
    }
}
