import java.util.List;

public class Exchange {

    private String name;
    private List<Queues> queues;

    public Exchange(String name) {
        this.name = name;
    }

    public Exchange(String name, List<Queues> queue) {
        this.name = name;
        this.queues = queue;
    }

    public void bindQueue(Queues queue) {
        queues.add(queue);
    }

    public void unbindQueue(Queues queue) {
        queues.remove(queue);
    }

    public void publish(String message) {
        for(Queues queue : queues) {
            queue.addMessage(message);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Queues> getQueues() {
        return queues;
    }

    public void setQueues(List<Queues> queues) {
        this.queues = queues;
    }
}
