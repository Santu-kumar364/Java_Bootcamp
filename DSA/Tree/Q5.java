// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
package Java_Bootcamp.DSA.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Main class to print each level
public class Q5 {
    public static  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public List<List<Integer>> ReverseEachLevelList(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            result.add(0,currentLevel);
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
        Q5 solution = new Q5();
        List<List<Integer>> ans = solution.ReverseEachLevelList(root);

        // Output: [[3], [9, 20], [15, 7]]
        System.out.println(ans);
    }
}



