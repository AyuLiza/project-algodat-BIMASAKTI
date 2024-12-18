public class LinkedList {
    Bus head;

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
    }

    // Menghapus bus dari linked list berdasarkan ID
    public void hapusBus(int id) {
        if (head == null) {
            System.out.println("Daftar kosong. Tidak ada bus yang dapat dihapus.");
            return;
        }

        if (head.id == id) {
            System.out.println("Bus ID: " + head.id + ", Nama: " + head.nama + ", Kapasitas: "
                    + head.kapasitas + ", Jadwal: " + head.jadwalKeberangkatan + ", Rute: " + head.rute
                    + " telah dihapus dari list.");
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
            System.out.println("Bus ID: " + current.next.id + ", Nama: " + current.next.nama + ", Kapasitas: "
                    + current.next.kapasitas + ", Jadwal: " + current.next.jadwalKeberangkatan + ", Rute: "
                    + current.next.rute + " telah dihapus dari list.");
            current.next = current.next.next;
        }
    }

    // Menampilkan semua bus dalam linked list
    public void tampilkanBus() {
        if (head == null) {
            System.out.println("Tidak ada bus yang tersedia dalam sistem.");
            return;
        }
        System.out
                .println("--------------------------------------------------------------------------------------");
        System.out.printf("| %-6s || %-20s || %-10s || %-10s || %-20s |\n", "Bus ID", "Nama", "Kapasitas", "Jadwal",
                "Rute");
        System.out
                .println("--------------------------------------------------------------------------------------");
        Bus current = head;
        while (current != null) {
            System.out.printf("| %-6d || %-20s || %-10d || %-10s || %-20s |\n", current.id, current.nama,
                    current.kapasitas, current.jadwalKeberangkatan, current.rute);
            current = current.next;
        }
        System.out
                .println("--------------------------------------------------------------------------------------");
    }
}