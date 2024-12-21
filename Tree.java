public class Tree {
    private TreeNode root;

    // Method buat rute
    public void addRoute(String parent, String child) {
        if (root == null) {
            root = new TreeNode(parent);
        }

        TreeNode parentNode = findNode(root, parent);
        if (parentNode != null) {
            if (parentNode.child == null) {
                parentNode.child = new TreeNode(child);
            } else {
                TreeNode siblingNode = parentNode.child;
                while (siblingNode.sibling != null) {
                    siblingNode = siblingNode.sibling;
                }
                siblingNode.sibling = new TreeNode(child);
            }
        }
    }

    private TreeNode findNode(TreeNode node, String city) {
        if (node == null) {
            return null;
        }
        if (node.city.equals(city)) {
            return node;
        }
        TreeNode childResult = findNode(node.child, city);
        if (childResult != null) {
            return childResult;
        }
        return findNode(node.sibling, city);
    }

    public void displayRoutes() {
        System.out.println("Struktur Rute Perjalanan:");
        displayRoutes(root, "");
    }

    private void displayRoutes(TreeNode node, String indent) {
        if (node != null) {
            System.out.println(indent + "└── " + node.city);
            displayRoutes(node.child, indent + "    ");
            displayRoutes(node.sibling, indent);
        }
    }

    public void findRoute(String destination) {
        StringBuilder route = new StringBuilder();
        if (findRoute(root, destination, route)) {
            route.setLength(route.length() - 4);
            System.out.println("Rute untuk " + destination + ": " + route.toString());
        } else {
            System.out.println("Kota " + destination + " tidak ditemukan.");
        }
    }

    private boolean findRoute(TreeNode node, String destination, StringBuilder route) {
        if (node == null) {
            return false;
        }
        route.append(node.city).append(" -> ");
        if (node.city.equals(destination)) {
            return true;
        }
        if (findRoute(node.child, destination, route)) {
            return true;
        }
        route.setLength(route.length() - (node.city.length() + 4));
        return findRoute(node.sibling, destination, route);
    }
}