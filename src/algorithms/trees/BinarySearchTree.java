package algorithms.trees;


public class BinarySearchTree {

    public void insert(BSTNode node, int value) {
        if (value <= node.data) {
            if (node.left == null) {
                node.left = new BSTNode(value);
            } else {
                insert(node.left, value);
            }
        } else {
            if (node.right == null) {
                node.right = new BSTNode(value);
            } else {
                insert(node.right, value);
            }
        }
    }

    public boolean contains(BSTNode node, int value) {
        if(value == node.data) {
            return true;
        } else if(value < node.data) {
            if(node.left == null) {
                return false;
            } else {
                return contains(node.left, value);
            }
        } else {
            if(node.right == null) {
                return false;
            } else {
                return contains(node.right, value);
            }
        }

    }

    public static void inorderTraversal(BSTNode node) {
        if(node.left != null) {
            inorderTraversal(node.left);
        }
        System.out.print(node.data + " ");
        if(node.right != null) {
            inorderTraversal(node.right);
        }
    }

    public static void preorderTraversal(BSTNode node) {
        System.out.print(node.data + " ");
        if(node.left != null) {
            preorderTraversal(node.left);
        }
        if(node.right != null) {
            preorderTraversal(node.right);
        }
    }

    public static void postorderTraversal(BSTNode node) {
        if(node.left != null) {
            postorderTraversal(node.left);
        }
        if(node.right != null) {
            postorderTraversal(node.right);
        }
        System.out.print(node.data + " ");
    }

    public static int getHeight(BSTNode node) {
        if(node == null) {
            return -1;
        }
        int leftDepth = getHeight(node.left);
        int rightDepth = getHeight(node.right);
        int depth = (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
        return depth;
    }

    public static boolean checkBST(BSTNode node, int min, int max) {
        if(node == null)
            return true;
        else if(node.data <= min || node.data >= max)
            return false;
        else
            return checkBST(node.left, min, node.data) && checkBST(node.right, node.data, max);

    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        BSTNode node = new BSTNode(10);
        bst.insert(node,5);
        bst.insert(node,15);
        bst.insert(node, 8);
        bst.insert(node, 3);
        bst.insert(node, 20);
        System.out.println(bst.contains(node, 21));
        inorderTraversal(node);
        System.out.println("\n");
        preorderTraversal(node);
        System.out.println("\n");
        postorderTraversal(node);
        System.out.println("\n");
        System.out.println(checkBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(getHeight(node));
    }
}
