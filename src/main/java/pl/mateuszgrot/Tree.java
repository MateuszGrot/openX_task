package pl.mateuszgrot;

public class Tree {

    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public int maxPathLength() {
        return maxPathLength(root, 0);
    }

    private int maxPathLength(Node node, int depth) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return depth;
        }

        int leftPathLength = maxPathLength(node.left, depth + 1);
        int rightPathLength = maxPathLength(node.right, depth + 1);

        return Math.max(leftPathLength, rightPathLength);
    }


    public int countLeaves(Node node) {
        if (node == null) {
            return 0;
        } else if (node.getLeft() == null && node.getRight() == null) {
            return 1;
        } else {
            return countLeaves(node.getLeft()) + countLeaves(node.getRight());
        }
    }

    public boolean areEquivalent(Tree other) {
        if (this.root == null && other.root == null) {
            return true;
        }
        if (this.root == null || other.root == null) {
            return false;
        }
        if (this.root.getValue() != other.root.getValue()) {
            return false;
        }
        return areEquivalent(this.root.getLeft(), other.root.getLeft())
            && areEquivalent(this.root.getRight(), other.root.getRight());
    }

    private boolean areEquivalent(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.getValue() != node2.getValue()) {
            return false;
        }
        return areEquivalent(node1.getLeft(), node2.getLeft())
            && areEquivalent(node1.getRight(), node2.getRight());
    }


}
