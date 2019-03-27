public class TreeNode {

    private String word;
    private int occurrence = 1;
    private TreeNode left, right;

    TreeNode(String word) {
        this.word = word;
        left = right = null;
    }

    //Balanced tree constructor
    TreeNode(String word, int encountered) {
        this.word = word;
        this.occurrence = encountered;
        left = right = null;
    }

    String getWord() {
        return word;
    }

    TreeNode getLeft() {
        return left;
    }

    TreeNode getRight() {
        return right;
    }

    void setLeft(TreeNode left) {
        this.left = left;
    }

    void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return occurrence + "\t : \t" + word;
    }
    void hit() {
        this.occurrence++;
    }
}
