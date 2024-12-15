public class Main {
    public static void main(String[] args) {
            BimasaktiTree tree = new BimasaktiTree();
            LinkedList daftarBus = new LinkedList();
            
            daftarBus.tambahBus(new Bus(1, "Bima Ekspres", 40, "08:00", "Mataram - Sumbawa"));
            daftarBus.tambahBus(new Bus(2, "Sumbawa Jaya", 50, "09:30", "Mataram - Bima"));
            daftarBus.tambahBus(new Bus(3, "Dompu Sejahtera", 30, "11:00", "Mataram - Dompu"));

            System.out.println("\nDaftar semua bus dalam sistem:");
            daftarBus.tampilkanBus();

            System.out.println("\nMenghapus bus dengan ID 2:");
            daftarBus.hapusBus(2);

            System.out.println("\nDaftar semua bus dalam sistem setelah penghapusan:");
            daftarBus.tampilkanBus();

            tree.addRoute("Mataram", "Sumbawa");
            tree.addRoute("Sumbawa", "Plampang");
            tree.addRoute("Plampang", "Empang");
            tree.addRoute("Empang", "Bima");
            tree.addRoute("Bima", "Dompu");
            tree.addRoute("Dompu", "Wera");
    
            tree.displayRoutes();
    
            System.out.println();
            tree.findRoute("Empang");
            tree.findRoute("Bima");
            tree.findRoute("Dompu");
            tree.findRoute("Wera");
        }
    }