public class Searching {
    // Linear Search untuk mencari bus berdasarkan ID bus
    public void searchLinear(LinkedList list, int targetId) {
        Bus foundBus = linearSearch(list, targetId);
        if (foundBus != null) {
            System.out.printf("Bus ID: %d, Nama: %s, Kapasitas: %d, Jadwal: %s, Rute: %s\n", foundBus.id, foundBus.nama,
                    foundBus.kapasitas, foundBus.jadwalKeberangkatan, foundBus.rute);
        } else {
            System.out.println("Bus dengan ID " + targetId + " tidak ditemukan.");
        }
    }

    // Linear Search Helper Method
    private Bus linearSearch(LinkedList list, int targetid) {
        Bus current = list.head;
        while (current != null) {
            if (current.id == targetid) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}