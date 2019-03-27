import java.io.File;
import java.util.Arrays;

public class Main {

    /*
            ********** Creating the binary tree **********
        1.  Prepare text
        2.  Create Tree root
        3.  Create empty tree
        4.  Put word into root node
            4.1 Check if new word is equal to current tree node word.
                4.1.1 Set current word encountered 1 up
            4.2 Compare new word to left nodes current word
                4.2.1 If left nodes current word is null. Set it new word
                4.2.2 Else,
            4.3 Compare new word to right nodes current word
        5. Tree is complete when no more words.
     */

    /*
            ********** Printing out the tree alphabetically **********
        We assume the binary trees left side is A and the right side is 2
        1. Try print out current node
            1.1 if left node is null
                1.1.1 Try print out left node
            1.2 else, try print out current node
                1.2.1 Try print out right node
     */
    public static void main(String[] args) {
        String[] text = FileToTextConverter.RefractorTextToCorrectArray(new File("src/text.txt"));

        //Fetches the balanced word
        String balanceWord = PopMiddleWord(text);

        //Creates a new Binary Tree set with the balanced word
        BinarySearchTree tree = new BinarySearchTree(balanceWord);

        //For each word in the string, place it into the tree node.
        if(text.length > 0) {
            for (String word : text) {
                if (!word.equals("")) {
                    tree.insert(tree.getRoot(), word);
                }
            }
            tree.print();
        } else {
            System.out.println("File found, but file was empty.");
        }


    }

    //Returns the middle word of the text when sorted
    private static String PopMiddleWord(String[] array) {
        String[] text = FileToTextConverter.RefractorTextToCorrectArray(new File("src/text.txt"));
        if(text != null) {
            Arrays.sort(text);
        }
        return text[text.length/2];
    }


}
