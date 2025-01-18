package queue;

public class LabQueue {
    private QueueElement first;
    private QueueElement last;

    public void push(String element) {
        QueueElement queueElement = new QueueElement(element);

        if (first == null)
            first = queueElement;
        else
            last.setNext(queueElement);

        last = queueElement;
    }

    public String pop() {
        if (first == null)
            return "";
        else {
            String element = first.getValue();
            first = first.getNext();

            if (first == null) last = null;
            return element;
        }
    }
}
