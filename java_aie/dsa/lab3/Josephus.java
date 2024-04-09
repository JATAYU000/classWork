  public class Josephus{
    public static void main(String[] args){
        CircularLinkedList list = new CircularLinkedList();
        int n = 7;
        int m = 3;
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        list.display();
        while(list.size > 1){
            for(int i = 0; i < m - 1; i++){
                list.head = list.head.next;
                list.tail = list.tail.next;
            }
            System.out.println("Node " + list.head.index + " has been removed");
            list.delete(list.head.index);
            list.display();
        }
        System.out.println("Node " + list.head.index + " is the winner");
    }
}