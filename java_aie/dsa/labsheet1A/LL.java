public class LL {

    private Node head;
    private int size;

    LL(){
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

    public boolean isLastElement() {
        return head != null && head.next == null;
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
        LL list = new LL();
        list.insertFirst(0);
        list.insertFirst(3);
        list.insertFirst(4);
        list.printList();
        list.insertLast(2);
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.size());
        list.insertFirst(45);
        System.out.println(list.size());
        list.insertAtPosition(3, 2); 
        list.deleteAtPosition(2);
        System.out.println("Is list empty? " + list.isEmpty());
        System.out.println("Is last element present? " + list.isLastElement());
        System.out.println("Is last element present? " + list.isLastElement());
        list.reverseIterate();
        list.printList();




    }
}
