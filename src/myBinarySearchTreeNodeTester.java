import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class myBinarySearchTreeNodeTester {

    //simple test  for height
    //height should be 1
    //Test passed
    @Test
    void height1() {
        int[] a = {2, 1, 8};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(a);
        int expected = 1;
        assertEquals(expected, tree.height());

    }
    //Test to see if text of repeating numbers comes out
    //Test does show text and passed.
    @Test
    void height2() {
        int[] a = {2,2,2,2,2};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(a);
        int expected = 0;
        assertEquals(expected, tree.height());

    }

    //test passed
    //test for insert.
    @Test
    public void insert() {
        int[] a = {5,3,6};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(a);
        int[] b = {5,3,6};
        myBinarySearchTreeNode expected = new myBinarySearchTreeNode(b);

        assertEquals(expected.myValue, test.myValue);
        assertEquals(expected.left.myValue, test.left.myValue);
        assertEquals(expected.right.myValue, test.right.myValue);
    }

    //test for depth
    //it searches for the number and then corrects the depth
    //test passed
    @Test
    public void depth() {
        int[] A = {7, 6, 3};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        int exp = 1;

        assertEquals(exp, test.depth(2));
    }


    // simple test for size.
    //There should be 7 nodes
    //test passed
    @Test
    public void size() {
        int[] A = {4, 6, 5, 8, 7, 3, 2};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        int expected = 7;

        assertEquals(expected, test.size());
    }

}