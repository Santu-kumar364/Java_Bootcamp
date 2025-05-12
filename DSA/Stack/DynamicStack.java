package Java_Bootcamp.DSA.Stack;

public class DynamicStack extends CustomStack {
    private final int MIN_CAPACITY;

    public DynamicStack() {
        super();
        this.MIN_CAPACITY = data.length;
    }

    public DynamicStack(int size) {
        super(size);
        this.MIN_CAPACITY = size;
    }

    @Override
    public boolean push(int item) {
        if (isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
            System.out.println("Stack expanded to size: " + data.length);
        }
        return super.push(item);
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int removed = data[ptr--];

        // Shrink if necessary
        if (ptr + 1 < data.length / 4 && data.length / 2 >= MIN_CAPACITY) {
            int[] temp = new int[data.length / 2];
            for (int i = 0; i <= ptr; i++) {
                temp[i] = data[i];
            }
            data = temp;
            System.out.println("Stack shrunk to size: " + data.length);
        }

        return removed;
    }

    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack(4);
        for (int i = 1; i <= 12; i++) {
            stack.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
