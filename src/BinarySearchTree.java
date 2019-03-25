public class BinarySearchTree {

    // Root of entire search tree
    private TreeNode root = null;

    public BinarySearchTree()
    {}

    public TreeNode getRoot() {
        return root;
    }

    public void insert(TreeNode current, String word)
    {
        TreeNode newNode = new TreeNode(word);

        if (root == null)
        {
            root = newNode;
            return;
        }

        if(current.word.compareTo(word) == 0) {
            current.hit();
        }
        else if (current.word.compareTo(word) < 0)
        {
            if (current.left == null)
            {
                current.left = newNode;
            }
            else
                insert(current.left, word);
        }
        else
        {
            if (current.right == null)
            {
                current.right = newNode;
            }
            else
                insert(current.right, word);
        }

    }

    public void inorder()
    {
        inorder(root);
        System.out.println("\n");
    }

    private void inorder(TreeNode t)
    {
        if (t != null)
        {
            inorder(t.left);
            System.out.println(t.toString());
            inorder(t.right);
        }
    }


}
