class Pesanan {
    int idBus;           // ID id bus yang mesan
    String namaPemesan;  // Nama yang pesan
    String waktuPesanan; // Waktu di pesan
    int noKursi;         // Nomor kursi di pesen

    // Constructor untuk kelas Pesanan
    public Pesanan(int idBus, String namaPemesan, String waktuPesanan, int noKursi) {
        this.idBus = idBus;
        this.namaPemesan = namaPemesan;
        this.waktuPesanan = waktuPesanan;
        this.noKursi = noKursi;
    }

    // Override method toString buat menampilkan informasi pesanan dengan format yang lebih baik
    @Override
    public String toString() {
        return "Pesanan [idBus=" + idBus + ", namaPemesan=" + namaPemesan +
               ", waktuPesanan=" + waktuPesanan + ", noKursi=" + noKursi + "]";
    }
}
