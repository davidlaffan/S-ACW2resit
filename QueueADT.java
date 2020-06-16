
public abstract interface QueueADT {

    public class QueueEmptyException extends Exception {
    }

    public abstract void enqueue(Object object);

    public abstract Object dequeue() throws QueueEmptyException;

}
