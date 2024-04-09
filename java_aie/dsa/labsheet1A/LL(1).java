public class LinkedList {
    private Node head;
    private int size;

    LinkedList(){
        this.size = 0;
    }

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

 
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }


    public void printList() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }


    public void insertAtPosition(int data, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        Node currNode = head;
        for (int i = 0; i < position - 1; i++) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
        size++;
    }


    public void deleteAtPosition(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            head = head.next;
        } else {
            Node currNode = head;
            for (int i = 0; i < position - 1; i++) {
                currNode = currNode.next;
            }
            currNode.next = currNode.next.next;
        }
        size--;
    }


    public boolean isEmpty() {
        return head == null;
    }
    

    public boolean isLastElement(int number) {
        if (head == null) {
            System.out.println("The list is empty");
            return false;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        return currNode.data == number;
    }
        

    public void deleteData(int data) {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        if (head.data == data) {
            head = head.next;
            size--;
            return;
        }
        Node currNode = head;
        while (currNode.next != null && currNode.next.data != data) {
            currNode = currNode.next;
        }
        if (currNode.next != null) {
            currNode.next = currNode.next.next;
            size--;
        } else {
            System.out.println("Data not found in the list");
        }
    }
        

    public int size(){
        return size;
    }


    public void reverseIterate(){
        if(head == null||head.next == null){
            return;
        }
        Node prevNode = head;
        Node curNode = head.next;
        while (curNode!=null) {
            Node nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(10);
        list.insertFirst(12);
        System.out.println("Linked List:");
        list.printList();
        list.deleteAtPosition(2);
        list.deleteAtPosition(4);
        list.printList();
        list.insertAtPosition(20, 2);
        list.insertFirst(20);
        list.insertLast(20);
        list.printList();
        System.out.println("Size of the list: " + list.size());
        list.deleteData(10);
        System.out.println("Is list empty? " + list.isEmpty());
        System.out.println("Is 10 the last element? " + list.isLastElement(10));
        list.reverseIterate();
        list.printList();
    }
}
