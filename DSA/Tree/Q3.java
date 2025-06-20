 package Java_Bootcamp.DSA.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Q3 {
    public static  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode findLevelOrderSuccessor(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
           
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
                if(currentNode.val == key) {   
                    return queue.peek();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Construct the binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Call the function
        Q3 solution = new Q3();
        TreeNode successor = solution.findLevelOrderSuccessor(root, 20);

        System.out.println(successor.val);
    }
}






