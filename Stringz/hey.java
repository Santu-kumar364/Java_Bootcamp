package Java_Bootcamp.Stringz;
import java.util.Scanner;

class BST {
    private  static class RNode {
        int data;
        RNode left;
        RNode right;

        public RNode(int data) {
            this.data = data;
        }
    }

    RNode root;

    public void populate(Scanner scanner) {
        System.out.print("Enter the root node ");
        int value =  scanner.nextInt();
        root = new RNode(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, RNode node) {
         
        int value = scanner.nextInt();
        
        if(value < node.data) {
            node.left = new RNode(value);
            populate(scanner, node.left);
        }
        
        if(value < node.data) {
            node.right = new RNode(value);
            populate(scanner, node.right);
        }
    }

    public void displayR() {
        if(root == null) {
            return;
        }
        displayPretty(root, 0);
    }

    public void displayPretty(RNode node, int level) {
        if(node == null) return;

        displayPretty(node.right, level + 1);
        System.out.print("    ".repeat(level));
        System.out.println(node.data);

        displayPretty(node.left, level + 1);

    }

    public static void main(String[] args) {
        BST t = new BST();
        Scanner scanner = new Scanner(System.in);
        t.populate(scanner);
        t.displayR();
    }
}



