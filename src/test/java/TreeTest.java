import org.junit.Test;
import pl.mateuszgrot.Node;
import pl.mateuszgrot.Tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TreeTest {

    private Node createTestTree() {
        Node root = new Node(5);
        Node node1 = new Node(3);
        Node node2 = new Node(8);
        Node node3 = new Node(1);
        Node node4 = new Node(4);
        Node node5 = new Node(7);
        Node node6 = new Node(10);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        return root;
    }

    @Test
    public void maxPathLengthTest() {
        Node root = createTestTree();
        Tree tree = new Tree(root);
        int expected = 2;
        int actual = tree.maxPathLength();
        String message = String.format("Expected path length: %d, but got: %d", expected, actual);
        assertEquals(message, expected, actual);
    }

    @Test
    public void countLeavesTest() {
        Node root = createTestTree();
        Tree tree = new Tree(root);
        assertEquals(4, tree.countLeaves(root));
    }

    @Test
    public void areEquivalentTest() {
        Node root1 = createTestTree();
        Node root2 = createTestTree();

        Tree tree1 = new Tree(root1);
        Tree tree2 = new Tree(root2);

        assertTrue(tree1.areEquivalent(tree2));
    }

    @Test
    public void areEquivalentTestFalse() {
        Node root1 = createTestTree();
        Node root2 = new Node(5);

        Tree tree1 = new Tree(root1);
        Tree tree2 = new Tree(root2);

        assertFalse(tree1.areEquivalent(tree2));
    }

}