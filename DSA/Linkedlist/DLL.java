package Java_Bootcamp.DSA.Linkedlist;


public class DLL {

    private Node head;
    private Node tail;
    private int size;
    public DLL() {
        this.size = 0;
    }
    
    private class Node {
        private int data;
        private Node next;
        private Node prev;
        
        public Node(int data) {
            this.data = data;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if(head != null) {
            head.prev = newNode;
        }
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
        newNode.prev = tail;
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

        Node current = get(index);
        Node newNode = new Node(data);
        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;
        size++;
    }

    public int deleteFirst(){
        int val = head.data;
        head = head.next;

        if(head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }
        int val = tail.data;
        tail = tail.prev;
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

        Node current = get(index);
        int val = current.data;
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size++;
        return val;
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
        Node last = null;
        while(current != null) {
            System.out.print(current.data + " -> ");
            last = current;
            current = current.next;
        }
        System.out.println("END");

        while(last != null) {
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public static void main(String[] args) {
        DLL list = new DLL();
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

        list.display(); 
    }
}
  










