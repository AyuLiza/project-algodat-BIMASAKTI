public class Sorting {
    // Bubble Sort berdasarkan jadwal keberangkatan
    public void bubbleSort(LinkedList list) {
        if (list.head == null)
            return;
        boolean swapped;
        do {
            swapped = false;
            Bus current = list.head;
            while (current != null && current.next != null) {
                if (current.jadwalKeberangkatan.compareTo(current.next.jadwalKeberangkatan) > 0) {
                    swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // Swap data antara dua node
    private void swap(Bus node1, Bus node2) {
        int tempId = node1.id;
        String tempNama = node1.nama;
        int tempKapasitas = node1.kapasitas;
        String tempJadwal = node1.jadwalKeberangkatan;
        String tempRute = node1.rute;

        node1.id = node2.id;
        node1.nama = node2.nama;
        node1.kapasitas = node2.kapasitas;
        node1.jadwalKeberangkatan = node2.jadwalKeberangkatan;
        node1.rute = node2.rute;

        node2.id = tempId;
        node2.nama = tempNama;
        node2.kapasitas = tempKapasitas;
        node2.jadwalKeberangkatan = tempJadwal;
        node2.rute = tempRute;
    }
}