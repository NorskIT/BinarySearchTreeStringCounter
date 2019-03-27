public class BinarySearchTree {

    // Root of the Binary tree
    private TreeNode root = null;

    //Word fetched from the middle index position of the array after it has been sorted.
    private String balancedWord = null;

    //Non-balanced tree
    public BinarySearchTree()
    {}

    //Balanced tree
    BinarySearchTree(String middleWord)
    {
        this.balancedWord = middleWord;

    }

    TreeNode getRoot() {
        return root;
    }

    //Receives the tree node and the word you which to insert.
    void insert(TreeNode current, String word)
    {
        //Sets the word to its own node
        TreeNode newNode = new TreeNode(word);

        //If tree has no root
        if (root == null)
        {
            //If balancedWord has been made
            if(balancedWord != null) {
                //Set root word to balancedWord. Set occurrences to prevent 1 extra count on root word.
                root = new TreeNode(balancedWord, 0);
            }
            //Sets the first word as the tree root
            else {
                root = newNode;
            }
            return;
        }

        //If new word is behind of this word in the alphabet, add it to the left node.
        if (current.getWord().compareTo(word) < 0)
        {
            //Left node is null, set new node to this left node.
            if (current.getLeft() == null)
            {
                current.setLeft(newNode);
            }
            //Try to insert into left node
            else
                insert(current.getLeft(), word);
        }

        //If new word is ahead of this word in the alphabet, add it to the right node.
        else if(current.getWord().compareTo(word) > 0)
        {
            //Right node is null, set new node to this right node.
            if (current.getRight() == null)
            {
                current.setRight(newNode);
            }
            //Try to insert into right node
            else
                insert(current.getRight(), word);
        }
        //New word is the same as this nodes word
        else {
            //Adds this tree node encountered one up.
            current.hit();
        }
    }

    //Print out the Binary tree
    void print()
    {
        //Start process at top of the tree
        print(root);
        System.out.println("\n");
    }

    //Print out a tree node under the root.
    private void print(TreeNode t)
    {
        //if root is not null
        if (t != null)
        {
            //Print out left node.
            print(t.getLeft());
            //Print out current node
            System.out.println(t.toString());
            //Print out right node.
            print(t.getRight());
        }
    }


}
