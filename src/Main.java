import java.io.File;

public class Main {

    /*
        1.  Prepare text
        2.  Create Tree root
        3.  Create empty tree
        4.
        5.
        6.
     */

    public static void main(String[] args) {
        String[] text = FileToTextConverter.ConvertToText(new File("src/text.txt"));
        //String[] text = FileToTextConverter.ConvertToText(new File("src/easytext.txt"));
        BinarySearchTree tree = new BinarySearchTree();
        for(String word : text) {
            tree.insert(tree.getRoot(), word);
        }
        tree.inorder();

    }


}
