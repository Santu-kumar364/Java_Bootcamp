package Java_Bootcamp.DSA.Tree;

public class BST {

    public class Node {
        int data;
        Node left;
        Node right;
        int height;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void populated(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }

    public void populatedSorted(int[] arr) {
        populatedSorted(arr, 0, arr.length);
    }

    private void populatedSorted(int[] arr, int start, int end) {
        if(start >= end) return;

        int mid = (start + end) / 2;

        insert(arr[mid]);
        populatedSorted(arr, start, mid);
        populatedSorted(arr, mid + 1, end);

    }

    public boolean balanced() {
        return balanced(root);
    }

    public boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(root, 0);
    }

    public void display(Node node, int level) {
        if (node == null) {
            return;
        }
        // Print right child first  
        display(node.right, level + 1);
        // Indentation for the current node
        System.out.print("    ".repeat(level));
        System.out.println(node.data);
        // Print left child
        display(node.left, level + 1);
    }

    // Pre-Order
    public void pre_order() {
        pre_order(root);
    }
    public void pre_order(Node node) {
        if(node == null) return;

        System.out.print(node.data + " -> ");
        pre_order(node.left);
        pre_order(node.right);
    }
    
    // In - Order
    public void in_order() {
        in_order(root);
    }
    public void in_order(Node node) {
        if(node == null) return;

        in_order(node.left);
        System.out.print(node.data + " -> ");
        in_order(node.right);
    }

    // Post-Order
    public void post_order() {
        post_order(root);
    }
    public void post_order(Node node) {
        if(node == null) return;

        post_order(node.left);
        post_order(node.right);
        System.out.print(node.data + " -> ");
    }

    public static void main(String[] args) {
        BST bst = new BST();
        // int[] arr = {9,5, 7, 1, 12, 13, 0, 18,11};
        int[] arr = {1,2,3,4,5,6,7,8,9};
        // bst.populated(arr);          // call when array is unsorted
        bst.populatedSorted(arr);        // call when array is Sorted
        System.out.println("Binary Search Tree:");
        bst.display();

        System.out.println("\nTree Properties:");
        System.out.println("Is empty? " + bst.isEmpty());
        System.out.println("Root height: " + bst.height(root));
        System.out.println("Is balanced? " + bst.balanced());

        System.out.println("\nPre-order");
        bst.pre_order();
        System.out.println("\nIn-order");
        bst.in_order();
        System.out.println("\nPost-order");
        bst.post_order();
    }
}




