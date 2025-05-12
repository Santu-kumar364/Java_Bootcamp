package Java_Bootcamp.DSA.Stack;
 
public class CustomStack {
    protected int[] data;
    protected int ptr = -1;

    public CustomStack() {
        this(10); // default size
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        data[++ptr] = item;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return data[ptr--];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
