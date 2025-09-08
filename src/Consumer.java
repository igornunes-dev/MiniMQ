public class Consumer {

    private Queues queues;

    public Consumer(Queues queues) {
        this.queues = queues;
    }

    public void consume() {
        String message = queues.consume();
        if(message != null) {
            System.out.println("Consumed message: " + message);
        } else {
            System.out.println("No message to consume");
        }
    }

    public Queues getQueues() {
        return queues;
    }
}
