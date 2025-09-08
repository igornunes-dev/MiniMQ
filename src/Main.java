import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Exchange exchange = new Exchange("exchange", new ArrayList<>());

        Queues queue1 = new Queues("queue1");
        Queues queue2 = new Queues("queue2");

        exchange.bindQueue(queue1);
        exchange.bindQueue(queue2);

        Producer producer = new Producer(exchange);

        Consumer consumer1 = new Consumer(queue1);
        Consumer consumer2 = new Consumer(queue2);

        producer.produce("Message 1");
        producer.produce("Message 2");

        consumer1.consume();
        consumer1.consume();
        consumer2.consume();
        consumer2.consume();

        exchange.unbindQueue(queue2);
        producer.produce("Message 3");

        consumer1.consume();
        consumer2.consume();
    }
}