//https://leetcode.com/problems/binary-tree-level-order-traversal/description/
package Java_Bootcamp.DSA.Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// Main class to print each level
public class Q4 {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public List<List<Integer>> zigzagLevelTranversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse = false; // Flag to indicate zigzag order

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                if (!reverse) {
                    TreeNode currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);

                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }

                } else {
                    TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);

                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);
                    }
                }   
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }

    public static void main(String[] args) {
        // Construct the binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Call the function
        Q4 solution = new Q4();
        List<List<Integer>> eachLevelList = solution.zigzagLevelTranversal(root);

        // Expected Output: [[3], [20, 9], [15, 7]]
        System.out.println(eachLevelList);
    }
}



