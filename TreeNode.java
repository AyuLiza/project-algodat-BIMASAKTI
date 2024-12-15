public class TreeNode {
    String city;
    TreeNode child;
    TreeNode sibling;

    public TreeNode(String city) {
        this.city = city;
        this.child = null;
        this.sibling = null;
    }
}