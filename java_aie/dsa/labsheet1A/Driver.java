public class Driver {
    private Node head;
    private int size;

    Driver() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
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

    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node curNode = head.next;
        while (curNode != null) {
            Node nextNode = curNode.next;
            curNode.next = prevNode;

            prevNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        size++;
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
        } else {
            Node currNode = head;
            for (int i = 0; i < position - 1; i++) {
                currNode = currNode.next;
            }
            newNode.next = currNode.next;
            currNode.next = newNode;
        }

        size++;
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
    

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.insertFirst(10);
        driver.insertFirst(20);
        driver.insertFirst(30);
        driver.insertFirst(40);
        driver.insertFirst(50);
        driver.insertFirst(60);
        System.out.println("Linked List:");
        driver.printList();
        driver.deleteAtPosition(3);
        driver.deleteAtPosition(5);
        driver.printList();
        driver.insertAtPosition(25, 2);
        driver.insertFirst(25);
        driver.insertLast(25);
        driver.printList();
        System.out.println("Size of the list: " + driver.size());
        driver.deleteData(10);
        System.out.println("Is list empty? " + driver.isEmpty());
        System.out.println("Is 10 the last element? " + driver.isLastElement(10));
        driver.reverseIterate();
        driver.printList();
    }
}
