public class Main {
    public static void main(String[] args) {
        BimasaktiTree tree = new BimasaktiTree();
        LinkedList daftarBus = new LinkedList();
        Sorting sorting = new Sorting();
        Searching searching = new Searching();
        Stack stack = new Stack();
        Queue queue = new Queue();

        // header program
        System.out.println(
                "================================================================================================================");
        System.out.println(
                "|                                                  BIMASAKTI                                                  |");
        System.out.println(
                "================================================================================================================");

        tree.addRoute("Mataram", "Sumbawa");
        tree.addRoute("Sumbawa", "Plampang");
        tree.addRoute("Sumbawa", "Empang");
        tree.addRoute("Mataram", "Bima");
        tree.addRoute("Bima", "Dompu");
        tree.addRoute("Bima", "Wera");

        System.out.println();
        tree.displayRoutes();

        System.out.println("\nCari rute untuk Mataram - Wera");
        tree.findRoute("Wera");

        daftarBus.tambahBus(new Bus(1, "Bima Ekspres", 40, "08:00", "Mataram - Sumbawa"));
        daftarBus.tambahBus(new Bus(2, "Sumbawa Jaya", 50, "09:30", "Mataram - Bima"));
        daftarBus.tambahBus(new Bus(3, "Dompu Sejahtera", 30, "11:00", "Mataram - Dompu"));
        daftarBus.tambahBus(new Bus(4, "Plampang Raya", 45, "10:00", "Sumbawa - Empang"));
        daftarBus.tambahBus(new Bus(5, "Mataram Sejahtera", 50, "11:00", "Mataram - Bima"));
        daftarBus.tambahBus(new Bus(6, "Dompu Lestari", 35, "12:00", "Bima - Dompu"));
        daftarBus.tambahBus(new Bus(7, "Wera Indah", 40, "13:00", "Bima - Wera"));
        daftarBus.tambahBus(new Bus(8, "Sumbawa Ekspres", 38, "14:00", "Mataram - Sumbawa"));
        daftarBus.tambahBus(new Bus(9, "Plampang Jaya", 42, "15:00", "Sumbawa - Plampang"));
        daftarBus.tambahBus(new Bus(10, "Empang Sentosa", 48, "16:00", "Sumbawa - Empang"));
        daftarBus.tambahBus(new Bus(11, "Bima Trans", 50, "17:00", "Mataram - Bima"));
        daftarBus.tambahBus(new Bus(12, "Dompu Perkasa", 30, "18:00", "Bima - Dompu"));
        daftarBus.tambahBus(new Bus(13, "Wera Jaya", 37, "19:00", "Bima - Wera"));
        daftarBus.tambahBus(new Bus(14, "Bima Prima", 45, "20:00", "Mataram - Bima"));
        daftarBus.tambahBus(new Bus(15, "Sumbawa Lestari", 39, "21:00", "Mataram - Sumbawa"));
        daftarBus.tambahBus(new Bus(16, "Plampang Sejahtera", 41, "22:00", "Sumbawa - Plampang"));
        daftarBus.tambahBus(new Bus(17, "Empang Raya", 35, "23:00", "Sumbawa - Empang"));
        daftarBus.tambahBus(new Bus(18, "Dompu Indah", 36, "07:00", "Bima - Dompu"));
        daftarBus.tambahBus(new Bus(19, "Wera Permai", 40, "08:30", "Bima - Wera"));
        daftarBus.tambahBus(new Bus(20, "Sumbawa Trans", 42, "09:30", "Mataram - Sumbawa"));

        System.out.println("\nDaftar Bus Dalam Sistem:");
        daftarBus.tampilkanBus();

        System.out.println("\nDaftar Urutan Bus Sesuai Jadwal Keberangkatan:");
        sorting.bubbleSort(daftarBus);
        daftarBus.tampilkanBus();

        System.out.println("\nMencari Bus Dengan ID 5:");
        searching.searchLinear(daftarBus, 5);

        System.out.println("\nMenghapus Bus Dengan ID 5:");
        daftarBus.hapusBus(5);
        daftarBus.tampilkanBus();

        stack.push(1, "Ayu", "05:00", 8);
        stack.push(2, "Uci", "04:00", 20);
        stack.push(3, "Aan", "07:00", 28);
        stack.push(4, "Nanang", "08:00", 40);
        stack.push(5, "Eka", "11:00", 30);
        stack.push(6, "Feri", "12:00", 13);
        stack.push(7, "Gigi", "13:00", 20);
        stack.push(8, "Hana", "14:00", 17);
        stack.push(9, "Icha", "15:00", 35);
        stack.push(10, "Joko", "16:00", 47);
        stack.push(11, "Kiki", "17:00", 50);
        stack.push(12, "Lina", "18:00", 11);
        stack.push(13, "Marisa", "19:00", 22);
        stack.push(14, "Nina", "20:00", 40);
        stack.push(15, "Oka", "21:00", 4);
        stack.push(16, "Nanda", "22:00", 1);
        stack.push(17, "Qita", "23:00", 10);
        stack.push(18, "Rita", "07:00", 7);
        stack.push(19, "Siti", "08:00", 12);
        stack.push(20, "Tina", "09:00", 2);
        System.out.println("\nDaftar Pesanan Bus");
        stack.tampilanStack();

        System.out.println("\nCustomer Tina dan Siti Membatalkan Pesanan Bus..");
        stack.pop();
        stack.pop();
        System.out.println("\nDaftar Pesanan Bus Setelah Customer Tina dan Siti Membatalkan Pesanan Bus:");
        stack.tampilanStack();

        queue.enqueue(1, "Ayu", "05:00", 8);
        queue.enqueue(2, "Uci", "04:00", 20);
        queue.enqueue(3, "Aan", "07:00", 28);
        queue.enqueue(4, "Nanang", "08:00", 40);
        queue.enqueue(5, "Eka", "11:00", 30);
        queue.enqueue(6, "Feri", "12:00", 13);
        queue.enqueue(7, "Gigi", "13:00", 20);
        queue.enqueue(8, "Hana", "14:00", 17);
        queue.enqueue(9, "Icha", "15:00", 35);
        queue.enqueue(10, "Joko", "16:00", 47);
        queue.enqueue(11, "Kiki", "17:00", 50);
        queue.enqueue(12, "Lina", "18:00", 11);
        queue.enqueue(13, "Marisa", "19:00", 22);
        queue.enqueue(14, "Nina", "20:00", 40);
        queue.enqueue(15, "Oka", "21:00", 4);
        queue.enqueue(16, "Nanda", "22:00", 1);
        queue.enqueue(17, "Qita", "23:00", 10);
        queue.enqueue(18, "Rita", "07:00", 7);

        System.out.println("\nDaftar Antrian Bus:");
        queue.tampilanQueue();
        System.out.println();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("\nDaftar Antrian Pesanan Setelah Pemrosesan Antrian Berjalan:");
        queue.tampilanQueue();
    }
}
