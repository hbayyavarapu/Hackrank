package algorithms.codinginterview;

class Node {
    int data;
    Node left;
    Node right;
}

public class BinarySearchTree {

    public static void main(String[] args) {

        Node n = new Node();
        n.data = 4;
        n.left = new Node();
        n.left.data = 2;
        n.right = new Node();
        n.right.data = 6;
        n.left.left = new Node();
        n.left.left.data = 1;
        n.left.right = new Node();
        n.left.right.data = 3;
        n.right.left = new Node();
        n.right.left.data = 5;
        n.right.right = new Node();
        n.right.right.data = 7;

        System.out.println(checkBST(n));


    }

    public static boolean checkBST(Node root){
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean checkBST(Node node, int min, int max) {
        if(node == null) { return true; }
        if(node.data <= min || node.data >= max ) return false;
        return checkBST(node.left, min, node.data) && checkBST(node.right, node.data, max);

    }

}
