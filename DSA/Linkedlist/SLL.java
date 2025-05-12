package Java_Bootcamp.DSA.Linkedlist;

public class SLL {

    private Node head;
    private Node tail;
    private int size;
    public SLL() {
        this.size = 0;
    }
    
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int data) {
        if(tail == null) {
            insertFirst(data);
            return;
        }

        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insert(int data, int index) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if(index == 0) {
            insertFirst(data);
            return;
        }
        if(index == size) {
            insertLast(data);
            return;
        }

        Node current = head;
        for(int i = 1; i < index; i++) {
            current = current.next;
        }
        Node newNode = new Node(data, current.next);
        current.next = newNode;
        size++;
    }
    
    // insert via Recursion
    public void insertRec(int data, int index) {
        head = insertRec(data, index, head);
    }
    private  Node insertRec(int data, int index, Node current) {
        if(index == 0) {
            Node newnNode = new Node(data, current);
            size++;
            return newnNode;
        }
        current.next = insertRec(data, index-1, current.next);
        return current;
    }
   

    public int deleteFirst(){
        int data = head.data;
        head = head.next;

        if(head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    public int deleteLast() {
        if(size <= 1) {
            deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.data;
        tail = secondLast;
        tail.next = null;
        
        size--;
        return val;
    }

    public int delete(int index) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.data;

        prev.next = prev.next.next;
        size++;
        return val;
    }

    public Node find(int value) {
        Node current = head;
        while(current != null) {
            if(current.data == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Node get(int index) {
        Node current = head;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void display() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("End");
    }

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(2);
        list.insertFirst(9);
        list.insertLast(1);
        list.insert(100, 3);
        list.display();

        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        System.out.println(list.delete(2));
        list.insertRec(25, 1);

        list.display();
        
    }
}
  


