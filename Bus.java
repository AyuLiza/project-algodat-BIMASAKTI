public class Bus {
    int id;
    String nama;
    int kapasitas;
    String jadwalKeberangkatan;
    String rute;
    Bus next;

    // Konstruktor
    public Bus(int id, String nama, int kapasitas, String jadwalKeberangkatan, String rute) {
        this.id = id;
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.jadwalKeberangkatan = jadwalKeberangkatan;
        this.rute = rute;
        this.next = null;
    }
}