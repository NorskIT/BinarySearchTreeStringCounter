public class BinarySearchTree {

    // Root of entire search tree
    private TreeNode root = null;

    private String middleWord = null;

    public BinarySearchTree()
    {}

    //Balanced tree
    public BinarySearchTree(String middleWord)
    {
        this.middleWord = middleWord;

    }

    public TreeNode getRoot() {
        return root;
    }

    //Send tree node and the word you which to insert.
    public void insert(TreeNode current, String word)
    {
        //Sets the word to its own node
        TreeNode newNode = new TreeNode(word);

        //If tree has no root
        if (root == null)
        {
            //Adds balanced word to the array, so we need to set the encountered to 0.
            if(middleWord != null) {
                root = new TreeNode(middleWord, 0);
            }
            //Sets the first word as the tree root
            else {
                root = newNode;
            }
            return;
        }

        //If new word is behind of this word in the alphabet, add it to the left node.
        if (current.word.compareTo(word) < 0)
        {
            //Left node is null, set new node to this left node.
            if (current.left == null)
            {
                current.left = newNode;
            }
            //Try to insert into left node
            else
                insert(current.left, word);
        }
        //If new word is ahead of this word in the alphabet, add it to the right node.
        else if(current.word.compareTo(word) > 0)
        {
            //Right node is null, set new node to this right node.
            if (current.right == null)
            {
                current.right = newNode;
            }
            //Try to insert into right node
            else
                insert(current.right, word);
        }
        //New word is the same as this nodes word
        else {
            //Adds this tree node encountered one up.
            current.hit();
        }

    }

    public void print()
    {
        print(root);
        System.out.println("\n");
    }

    private void print(TreeNode t)
    {
        if (t != null)
        {
            print(t.left);
            System.out.println(t.toString());
            print(t.right);
        }
    }


}
