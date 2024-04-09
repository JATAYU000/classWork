package lab3;
public class CircularDoublyLinkedList {
    private Node head;
    public static class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node last = head.prev;
            newNode.next = head;
            newNode.prev = last;
            last.next = newNode;
            head.prev = newNode;
        }
    }
    public Node getWinner(int start, int step) {
        if (head == null) {
            return null;
        }
        Node current = head;
        for (int i = 0; i < start; i++) {
            current = current.next;
        }
        while (current.next != current) {
            for (int i = 0; i < step - 1; i++) {
                current = current.next;
            }
            Node nextNode = current.next;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current = nextNode;
        }
        return current;
    }
}