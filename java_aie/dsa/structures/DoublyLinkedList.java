class node{
    int data;
    node next;
    node prev;
}

class DoublyLinkedList{
    node head;
    node tail;
    public int sizeof(){
        node looper = head;
        int size = 0;
        while(looper!=null){
            size +=1;
            looper=looper.next;
        }
        return size;
    }

    public void display(){
        node looper = head;
        while(looper!=null){
            System.out.println(looper.data + " <==> ");
            looper=looper.next;
        }
    }

    public void displayReverse(){
        node looper = tail;
        while(looper!=null){
            System.out.println(looper.data + " <==> ");
            looper=looper.prev;
        }
    }

    public void insertPos(int data,int index){
        
        if(index<1){this.insertStart(data);}
        else if(index>this.sizeof()){this.insertEnd(data);}
        else{
            node temp = new node();
            temp.data = data;
            node looper = head;
            for(int i = 1;i<index;i++){
                looper = looper.next;
            }
            temp.prev=looper;
            temp.next = looper.next;
            looper.next = temp;
            temp.next.prev = temp;
        }
    }

    public void insertEnd(int data){
        node temp = new node();
        temp.data = data;
        if(tail==null){
            tail=temp;
            head = temp;
        } else {
            temp.prev = tail;
            tail.next= temp;
            tail = temp; 
        }
    }
    public void insertStart(int data){
        node temp = new node();
        temp.data = data;
        if(head==null){
            head=temp;
            tail = temp;
        } else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }
    public void deleteAt(int index){
        if(index == 0){
            head.next.prev = null;
            head = head.next;
        }
        else if(index+1 == this.sizeof()){
            tail.prev.next = null;
            tail = tail.prev;
        }
        else{
            node looper = head;
            for(int i = 1;i<index;i++){
                looper = looper.next;
            }
            looper.next.next.prev=looper;
            looper.next=looper.next.next;
        }
    }

    public static void main(String args[]){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertStart(20);
        dll.insertStart(10);
        dll.insertStart(5);
        dll.insertEnd(30);
        dll.insertEnd(40);
        System.out.println(dll.sizeof());
        dll.display();
        System.out.println(dll.sizeof());
        dll.displayReverse();
        System.out.println();
        dll.insertPos(25,3);
        dll.insertPos(45,30);
        dll.display();
        dll.deleteAt(4);
        dll.display();
    }
}