package BinaryTree;

public class DiameterOfTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return lh+rh+1;
    }

    public static int diameter(Node root) {
        if(root == null) {
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftHei = height(root.left);

        int rightDiam = diameter(root.right);
        int rightHei = height(root.right);

        int selfDiam = leftHei + rightHei + 1;

        return Math.max(selfDiam , Math.max(rightDiam, leftDiam));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root));

    }
}
