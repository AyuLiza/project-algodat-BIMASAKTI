class Pesanan {
    int idBus;
    String namaPemesan;
    String waktuPesanan;
    int noKursi;
    Pesanan next;

    public Pesanan(int idBus, String namaPemesan, String waktuPesanan, int noKursi) {
        this.idBus = idBus;
        this.namaPemesan = namaPemesan;
        this.waktuPesanan = waktuPesanan;
        this.noKursi = noKursi;
    }
}