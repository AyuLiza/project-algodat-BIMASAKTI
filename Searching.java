public class Searching {
    // Binary Search untuk mencari bus berdasarkan ID bus
    public void searchBinary(LinkedList list, int targetId) {
        Bus foundBus = binarySearch(list, targetId);
        if (foundBus != null) {
            System.out.println("Bus ditemukan:\n" + foundBus);
        } else {
            System.out.println("Bus dengan ID " + targetId + " tidak ditemukan.");
        }
    }

    // Binary Search Helper Method untuk mencari bus berdasarkan ID
    public Bus binarySearch(LinkedList list, int targetId) {
        int left = 0;
        int right = getSize(list) - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Bus midNode = getNodeAt(list, mid);
            if (midNode.id == targetId) {
                return midNode;
            } else if (midNode.id < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Mendapatkan ukuran linked list
    private int getSize(LinkedList list) {
        int size = 0;
        Bus current = list.head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // Mendapatkan node pada indeks tertentu
    private Bus getNodeAt(LinkedList list, int index) {
        Bus current = list.head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        return current;
    }
}