public class CircularLinkedList{
    public Node head;
    public Node tail;
    public int size;
    public CircularLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    public void add(int index){
        Node newNode = new Node(index);
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }
    public void delete(int index){
        Node current = head;
        Node previous = head;
        while(current.index != index){
            if(current.next == head){
                System.out.println("Index not found");
                break;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if(current == head){
            head = head.next;
            tail.next = head;
        } else if(current == tail){
            tail = previous;
            tail.next = head;
        } else {
            previous.next = current.next;
        }
        size--;
    }
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
        } else {
            do{
                System.out.print(" " + current.index);
                current = current.next;
            } while(current != head);
            System.out.println();
        }
    }
    public int size(){
        return this.size;
    }
}