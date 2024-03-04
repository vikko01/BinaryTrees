package BinaryTree;

public class PreorderTraversal {

     static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static class BinaryTree {
            static int idx = -1;
            public static Node buildTree(int nodes[]) {
                idx++;
                if(nodes[idx] == -1) {
                    return null;
                }
                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);

                return newNode;
            }
          
        }
        public static void preorderTraversal(Node root) {
            if(root == null) {
                return;
            }
            System.out.println(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        PreorderTraversal tree = new PreorderTraversal();
        
        Node root = buildTree(nodes);

        tree.preorderTraversal(root);
    }
}
