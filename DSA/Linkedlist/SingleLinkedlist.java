package Java_Bootcamp.DSA.Linkedlist;

 
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    } 
}


public class SingleLinkedlist {

    Node head;

    void insert(int data) {
        Node newnode = new Node(data);
        if(head == null) {
            head = newnode;
            return;
        }

        Node current = head;
        while(current.next != null) {
            current = current.next;
        }

        current.next = newnode;
    }

    void delete(int key) {
        if(head == null) return;

        Node current = head;
        while(current.next != null && current.next.data != key) {
            current = current.next;
        }

        if(current.next == null) {
            System.out.println("doesn't found key");
            return;
        }

        current.next = current.next.next;
    }

    void display() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SingleLinkedlist list = new SingleLinkedlist();
        list.insert(5);
        list.insert(7);
        list.insert(8);
        list.insert(3);
        list.delete(3);

        list.display();
    }
}






