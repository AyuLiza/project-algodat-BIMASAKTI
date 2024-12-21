public class Stack {
    Pesanan top;

    public Stack() {
        top = null;
    }

    public void push(int idBus, String namaPemesan, String waktuPesanan, int noKursi) {
        Pesanan newPesanan = new Pesanan(idBus, namaPemesan, waktuPesanan, noKursi);
        newPesanan.next = top;
        top = newPesanan;
    }

    public Pesanan pop() {
        if (top == null) {
            System.out.println("Tidak ada pesanan yang dapat dihapus.");
            return null;
        } else {
            Pesanan temp = top;
            System.out.println("Pesanan dengan ID Bus = " + top.idBus + ", Nama Pemesan = " + top.namaPemesan
                    + ", Waktu Pesanan = " + top.waktuPesanan + ", Nomor Kursi = " + top.noKursi + " telah dihapus.");
            top = top.next;
            return temp;
        }
    }

    public void tampilanStack() {
        if (top == null) {
            System.out.println("Tidak ada pesanan yang tersedia.");
        } else {
            System.out.println("+--------+--------------+---------------+---------------+");
            System.out.println("| ID Bus | Nama Pemesan | Waktu Pesanan | Nomor Kursi   |");
            System.out.println("+--------+--------------+---------------+---------------+");

            Pesanan current = top;
            while (current != null) {
                System.out.printf("| %-6d | %-12s | %-13s | %-13d |\n",
                        current.idBus, current.namaPemesan, current.waktuPesanan, current.noKursi);
                current = current.next;
            }
            System.out.println("+--------+--------------+---------------+---------------+");
        }
    }
}