import java.util.LinkedList;
import java.util.Queue;
public class Queues {

    private String name;
    private Queue<String> messages;

    public Queues(String name) {
        this.name = name;
        this.messages = new LinkedList<>();
    }

    public void addMessage(String message) {
        messages.add(message);
    }

    public String consume() {
        return messages.poll();
    }

    public String getName() {
        return name;
    }

    public Queue<String> getMessages() {
        return messages;
    }

    public void setMessages(Queue<String> messages) {
        this.messages = messages;
    }
}
