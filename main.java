public class Main {
    public static void main(String[] args) {
            BimasaktiTree tree = new BimasaktiTree();
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