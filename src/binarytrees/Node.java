package binarytrees;

public class Node {

    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = right = null;
    }

    class BinaryTree {
        Node root;

        public int countNodes(Node node) {
            if(node == null) {
                return 0;
            }
            return 1 + countNodes(node.left) + countNodes(node.right);
        }
    }
}


