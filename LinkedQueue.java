
public class LinkedQueue implements QueueADT {

    private class QueueNode {

        private Object object;
        private QueueNode next;
    }
    private QueueNode head;
    private QueueNode tail;

    public String toString() {
        /* algorithm
            set up a string to contain the queue details
            if queue is not empty then
                set current to the head node
                do
                    add the current object to the string
                    set current to the next node
                while node available
            else
                add empty queue message to the string
            end if
         */
        String queueDetails = new String();
        if (this.head != null) {
            QueueNode current = this.head;
            do {
                queueDetails += current.object + "\n";
                current = current.next;
            } while (current != null);
        } else {
            queueDetails += "queue is empty";
        }
        return queueDetails;
    }

    public void enqueue(Object object) {
        /* algorithm
            create new queue node
            copy object to new node's object
            if queue is empty then
                set the head and tail to refer to the new node
            else
                set the next node of the tail to refer to the new node
                set the tail to refer to the next node
            end if
         */
        QueueNode newNode = new QueueNode();
        newNode.object = object;
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = this.tail.next;
        }
    }

    public Object dequeue() throws QueueEmptyException {
        /* algorithm
            if queue is empty then
                throw queue empty exception
            end if
            save the object at the head node
            save the node being removed // the head node
            set the head node to refer to the next node
            if queue is empty then
                set the tail node to null
            end if
            delete the removed node object
            set the removed node next to null
         */
        if (this.head == null) {
            throw new QueueEmptyException();
        }
        Object removedObject = this.head.object;
        QueueNode removedNode = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        removedNode.object = null;
        removedNode.next=null;
        return removedObject;
    }

}
