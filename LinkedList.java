package topic_2_linkedlist_string;

public class LinkedList {
    private Node head;

    // Method to add a new node at the end of the list
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

     // Method to print the linked list
     public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(" -> null");
    }

    

   
    }
 
