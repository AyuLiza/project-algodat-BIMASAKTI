public class LinkedList {
    private Bus head; 
    public LinkedList() {
        this.head = null;
    }

    // Menambahkan bus ke linked list
    public void tambahBus(Bus bus) {
        if (head == null) {
            head = bus; 
        } else {
            Bus current = head;
            while (current.next != null) {
                current = current.next; 
            }
            current.next = bus; 
        }
        System.out.println("Bus berhasil ditambahkan: " + bus);
    }

    // Menghapus bus dari linked list berdasarkan ID
    public void hapusBus(int id) {
        if (head == null) {
            System.out.println("Daftar kosong. Tidak ada bus yang dapat dihapus.");
            return;
        }

        if (head.id == id) {
            System.out.println("Bus dihapus: " + head);
            head = head.next; 
            return;
        }

        Bus current = head;
        while (current.next != null && current.next.id != id) {
            current = current.next; 
        }

        if (current.next == null) {
            System.out.println("Bus dengan ID " + id + " tidak ditemukan.");
        } else {
            System.out.println("Bus dihapus: " + current.next);
            current.next = current.next.next; 
        }
    }

    // Menampilkan semua bus dalam linked list
    public void tampilkanBus() {
        if (head == null) {
            System.out.println("Tidak ada bus yang tersedia dalam sistem.");
            return;
        }

        Bus current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next; 
        }
    }
}
