package BinaryTree;

import BinaryTree.BuildPreOrder.Node.InnerBuildPreOrder;

public class PostorderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static class InnerBuildPreOrder {
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
            public static void postorderTraversal(Node root) {
                if(root == null) {
                    System.out.print("-1");
                    return;
                }
                System.out.print(root.data + " ");
                postorderTraversal(root.left);
                postorderTraversal(root.right);
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        InnerBuildPreOrder tree = new InnerBuildPreOrder();
        Node root = tree.buildTree(nodes);
        tree.postorderTraversal(root);
    }
}
