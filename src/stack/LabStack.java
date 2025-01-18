package stack;

public class LabStack {
    private StackElement next;

    public void push(String element) {
        StackElement stackElement = new StackElement(element);

        if (next != null)
            stackElement.setNext(next);
        next = stackElement;
    }

    public String pop() {
        if (next == null)
            return "";
        else {
            String poppedElement = next.getValue();
            next = next.getNext();
            return poppedElement;
        }
    }
}
