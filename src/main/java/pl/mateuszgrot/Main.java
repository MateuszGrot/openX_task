package pl.mateuszgrot;


public class Main {

    public static void main(String[] args) {
        Node node5 = new Node(5);
        Node node3 = new Node(3);
        Node node7 = new Node(7);
        Node node2 = new Node(2);
        Node node5b = new Node(5);
        Node node1 = new Node(1);
        Node node0 = new Node(0);
        Node node2b = new Node(2);
        Node node8 = new Node(8);
        Node node5c = new Node(5);

        node5.left = node3;
        node5.right = node7;
        node3.left = node2;
        node3.right = node5b;
        node7.left = node1;
        node7.right = node0;
        node0.left = node2b;
        node0.right = node8;
        node8.right = node5c;

        Tree tree1 = new Tree(node5);

        int maxPathLength = tree1.maxPathLength();

        System.out.println("Max path length: " + maxPathLength);

        int leafCount = tree1.countLeaves(node5);
        System.out.println("Count of leaves: " + leafCount);

        Tree tree2 = new Tree(node5);

        boolean areEquivalent = tree1.areEquivalent(tree2);

        System.out.println("Are trees equivalent? " + areEquivalent);


    }
}
