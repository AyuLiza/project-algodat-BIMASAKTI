public class BusQueue {
    private BusNode front, rear;

    private class BusNode {
        Bus bus;
        BusNode next;

        public BusNode(Bus bus) {
            this.bus = bus;
            this.next = null;
        }
    }

    public BusQueue() {
        front = rear = null;
    }

    // Enqueue a bus into the queue
    public void enqueue(Bus bus) {
        BusNode newNode = new BusNode(bus);
        if (rear == null) {
            front = rear = newNode;
            System.out.println("Bus dimasukkan ke queue: " + bus);
            return;
        }
        rear.next = newNode;
        rear = newNode;
        System.out.println("Bus dimasukkan ke queue: " + bus);
    }

    // Dequeue a bus from the queue
    public Bus dequeue() {
        if (front == null) {
            System.out.println("Queue kosong.");
            return null;
        }
        Bus dequeuedBus = front.bus;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println("Bus dihapus dari queue: " + dequeuedBus);
        return dequeuedBus;
    }

    // Peek the front bus in the queue
    public Bus peek() {
        if (front == null) {
            System.out.println("Queue kosong.");
            return null;
        }
        return front.bus;
    }
}
