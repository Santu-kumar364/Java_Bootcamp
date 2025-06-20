// https://leetcode.com/problems/average-of-levels-in-binary-tree/

package Java_Bootcamp.DSA.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Q1 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double sum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                sum += currentNode.val;

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(sum / levelSize);
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
        Q1 solution = new Q1();
        List<Double> averages = solution.averageOfLevels(root);

        // Output: [3.0, 14.5, 11.0]
        System.out.println(averages);
    }
}
