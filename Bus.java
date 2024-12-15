public class Bus {
    public int id;
    public String nama;
    public int kapasitas;
    public String jadwalKeberangkatan;
    public String rute;
    public Bus next; 

    // Konstruktor
    public Bus(int id, String nama, int kapasitas, String jadwalKeberangkatan, String rute) {
        this.id = id;
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.jadwalKeberangkatan = jadwalKeberangkatan;
        this.rute = rute;
        this.next = null; 
    }

    @Override
    public String toString() {
        return "Bus ID: " + id + ", Nama: " + nama + ", Kapasitas: " + kapasitas + ", Jadwal: " + jadwalKeberangkatan + ", Rute: " + rute;
    }
}
