public class BusStack {
    private BusNode top;

    private class BusNode {
        Bus bus;
        BusNode next;

        public BusNode(Bus bus) {
            this.bus = bus;
            this.next = null;
        }
    }

    public BusStack() {
        top = null;
    }

    // Push a bus onto the stack
    public void push(Bus bus) {
        BusNode newNode = new BusNode(bus);
        newNode.next = top;
        top = newNode;
        System.out.println("Bus ditambahkan ke stack: " + bus);
    }

    // Pop a bus from the stack
    public Bus pop() {
        if (top == null) {
            System.out.println("Stack kosong.");
            return null;
        }
        Bus poppedBus = top.bus;
        top = top.next;
        System.out.println("Bus dihapus dari stack: " + poppedBus);
        return poppedBus;
    }

    // Peek the top bus in the stack
    public Bus peek() {
        if (top == null) {
            System.out.println("Stack kosong.");
            return null;
        }
        return top.bus;
    }
}
