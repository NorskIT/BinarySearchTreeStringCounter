public class TreeNode {

    String word;
    int encountered = 1;
    TreeNode left, right;

    public TreeNode(String word) {
        this.word = word;
        left = right = null;
    }

    //Balanced tree constructor
    public TreeNode(String word, int encountered) {
        this.word = word;
        this.encountered = encountered;
        left = right = null;
    }

    @Override
    public String toString() {
        return encountered + "\t : \t" + word;
    }

    void hit() {
        this.encountered++;
    }
}
