class node{
    int data;
    node next;
}

public class SinglyLinkedList{
    node head;

    public void insertStart(int data){
        node temp = new node();
        temp.data = data;
        if(head==null){
            this.head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }
    public void insertEnd(int data){
        node temp = new node();
        temp.data = data;
        if(head==null){
            this.head = temp;
        } else {
            node looper = head;
            while(looper.next!=null){
                looper = looper.next;
            }
            looper.next = temp;
        }
    }
    public void insertPos(int data,int index){
        node temp = new node();
        temp.data = data;
        if(index == 0 || head==null){this.insertStart(data);}
        else{
            node looper =head;
            while(looper!=null){
                if(index == 1){
                    temp.next = looper.next;
                    looper.next=temp;
                    break;
                }
                index=index-1;
                looper = looper.next;
            }
        }
    }
    public int find(int data){
        int index =-1;
        node looper = head;
        int indexlooper = 0;
        while(looper!=null){
            if(looper.data == data){index = indexlooper;break;}
            indexlooper+=1;
            looper=looper.next;
        }
        return index;
    }

    public void deleteAt(int index){
        node looper =head;
        while(index!=1){
            looper = looper.next;
            index-=1;
        }
        looper.next = looper.next.next;
    }

    public void display(){
        node looper =head;
        while (looper!=null){
            System.out.print(looper.data  + "--->  ");
            looper=looper.next;
        }
    }

    public static void main(String arg[]){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertStart(10);
        sll.insertEnd(20);
        sll.insertEnd(30);
        sll.insertPos(15,1);
        sll.insertPos(5,0);
        sll.display();
        int index = sll.find(15);
        System.out.println(index);
        sll.deleteAt(index);
        sll.display();
    }
}