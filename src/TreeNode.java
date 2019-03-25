public class TreeNode {

    String word;
    int encountered = 1;
    TreeNode left, right;

    public TreeNode(String word) {
        this.word = word;
        left = right = null;
    }

    @Override
    public String toString() {
        return encountered + "\t : \t" + word;
    }

    public void hit() {
        this.encountered++;
    }
}
