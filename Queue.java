public class Queue {
    Pesanan front, rear;

    public Queue() {
        front = rear = null;
    }

    public void enqueue(int idBus, String namaPemesan, String waktuPesanan, int noKursi) {
        Pesanan newPesanan = new Pesanan(idBus, namaPemesan, waktuPesanan, noKursi);
        if (front == null) {
            front = rear = newPesanan;
        } else {
            rear.next = newPesanan;
            rear = newPesanan;
        }
    }

    public Pesanan dequeue() {
        if (front == null) {
            System.out.println("Antrian kosong.");
            return null;
        } else {
            Pesanan temp = front;
            System.out.println("Antrian dengan ID Bus = " + front.idBus + ", Nama Pemesan = " + front.namaPemesan
                    + ", Waktu Pesanan = " + front.waktuPesanan + ", Nomor Kursi = " + front.noKursi + " diproses.");
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return temp;
        }
    }

    public void tampilanQueue() {
        if (front == null) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("+-----+----------------+--------------+-------------+");
            System.out.println("| ID  | Nama Pemesan   | Waktu Pesanan| Nomor Kursi |");
            System.out.println("+-----+----------------+--------------+-------------+");

            Pesanan current = front;
            while (current != null) {
                System.out.printf("| %-4d | %-14s | %-12s | %-10d |\n",
                        current.idBus, current.namaPemesan, current.waktuPesanan, current.noKursi);
                current = current.next;
            }
            System.out.println("+-----+----------------+--------------+-------------+");
        }
    }
}