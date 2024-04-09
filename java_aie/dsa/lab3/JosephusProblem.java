package lab3;

class JosephusProblem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        for (int i = 1; i <= n; i++) {
            list.insert(i);
        }
        CircularDoublyLinkedList.Node winner = list.getWinner(n, m);
        System.out.println("The winner is: " + winner.data);
    }
}