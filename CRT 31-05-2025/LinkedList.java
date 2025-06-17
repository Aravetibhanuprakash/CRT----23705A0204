public class LinkedList {
    // Node class representing each element in the list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the list

    // Method to insert a new node at the end
    public void insertAtEnd(int data) {
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

    // Method to delete a node by value
    public void deleteByValue(int key) {
        Node current = head;
        Node previous = null;

        // If the node to be deleted is the head
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        // Search for the node to be deleted
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        // If the key was not found
        if (current == null) {
            System.out.println("Node with value " + key + " not found.");
            return;
        }

        // Unlink the node from the list
        previous.next = current.next;
    }

    // Method to traverse and print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to search for a value in the list
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserting elements
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        // Printing the list
        System.out.println("Linked List:");
        list.printList();

        // Searching for an element
        int searchValue = 20;
        if (list.search(searchValue)) {
            System.out.println(searchValue + " found in the list.");
        } else {
            System.out.println(searchValue + " not found in the list.");
        }

        // Deleting a node
        list.deleteByValue(30);
        System.out.println("Linked List after deletion:");
        list.printList();
    }
}
