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

    // Method to delete a node by value
    public void deleteByValue(String value) {
        if (head == null) return;

        if (head.data.equals(value)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Method to move a node to a new position (swap nodes)
    public void moveNodePointer(int currentIndex, int newIndex) {
        if (head == null || currentIndex == newIndex) return;

        // Edge case: Invalid indices (negative or out-of-bound)
        if (currentIndex < 0 || newIndex < 0) return;

        // Find the node to move
        Node prev = null, current = head, movingNode = null, movingPrev = null;
        int count = 0;

        while (current != null && count < currentIndex) {
            movingPrev = prev;
            prev = current;
            current = current.next;
            count++;
        }

        movingNode = current;

        // If the node to move was not found or index is out of bounds
        if (movingNode == null) return;

        // Remove the node from its current position
        if (movingPrev != null) {
            movingPrev.next = movingNode.next;
        } else {
            head = movingNode.next; // Moving the head
        }

        // Reset current to head and insert the node at the new position
        prev = null;
        current = head;
        count = 0;

        while (current != null && count < newIndex) {
            prev = current;
            current = current.next;
            count++;
        }

        if (prev != null) {
            movingNode.next = current;
            prev.next = movingNode;
        } else {
            movingNode.next = head;
            head = movingNode;
        }
    }

   
    }
 
