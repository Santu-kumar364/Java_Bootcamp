package Java_Bootcamp.DSA.Tree;
import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class CustomTree {
    Node root;

    public void populate(Scanner scanner) {
        System.out.print("Enter root node : ");
        int data = scanner.nextInt();
        root = new Node(data);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter Left of " + node.data);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.data);
            int data = scanner.nextInt();
            node.left = new Node(data);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter Right of " + node.data);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.data);
            int data = scanner.nextInt();
            node.right = new Node(data);
            populate(scanner, node.right);
        }
    }
 
    public void display() {
        if (root == null) {
            return;
        }
        displayVertical(root, 0);
    }

    private void displayVertical(Node node, int level) {
        if (node == null) {
            return;
        }
        // Print right child first (to align branches correctly)
        displayVertical(node.right, level + 1);

        // Indentation for the current node
        System.out.print("    ".repeat(level));
        System.out.println(node.data);

        // Print left child
        displayVertical(node.left, level + 1);
    }

    public static void main(String[] args) {
        CustomTree tree = new CustomTree();
        Scanner sc = new Scanner(System.in);
        tree.populate(sc);
        tree.display();
    }
}


