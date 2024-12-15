class Pesanan {
    int idBus;
    String namaPemesan;
    String waktuPesanan;
    int noKursi;

    // Constructor
    public Pesanan(int idBus, String namaPemesan, String waktuPesanan, int noKursi) {
        this.idBus = idBus;
        this.namaPemesan = namaPemesan;
        this.waktuPesanan = waktuPesanan;
        this.noKursi = noKursi;
    }

    @Override
    public String toString() {
        return "Pesanan [idBus=" + idBus + ", namaPemesan=" + namaPemesan +
               ", waktuPesanan=" + waktuPesanan + ", noKursi=" + noKursi + "]";
    }
}
