package Java_Bootcamp.DSA.Linkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL() {
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
    
    // Duplicates
    public void deleteDuplicates() {
        Node current = head;
        while(current != null && current.next != null) {
            if(current.data == current.next.data) {
                current.next = current.next.next;
                size--;
            }
            else{
                current = current.next;
            }
        }
        tail =  current;
        tail.next = null;
    }

    // Merge
    
    public static  LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f != null && s != null) {
            if(f.data < s.data) {
                ans.insertLast(f.data);
                f = f.next;
            } else {
                ans.insertLast(s.data);
                s = s.next;
            }
        }

        while(f != null) {
            ans.insertLast(f.data);
            f = f.next;
        }
        while(s != null) {
            ans.insertLast(s.data);
            s = s.next;

        }

        return ans;
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
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(4);
         
        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(4);

        LL ans = LL.merge(first, second);
        ans.display();

    }
}
  
