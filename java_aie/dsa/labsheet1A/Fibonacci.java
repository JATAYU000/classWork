import java.util.*;
public class Fibonacci{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.print("Enter a number : ");
		int n = obj.nextInt();
		if(n < 1){
			System.out.println("Enter a non zero positive integer.");
		}
		else if(n == 1){
			arr.add(1);
		}
		else if(n == 2){
			arr.add(1);
			arr.add(1);
		}
		else if(n > 2){
			arr.add(1);
            arr.add(1);
            for(int i = 3; i <= n; i++){
				int f = arr.get(i - 3) + arr.get(i - 2);
                arr.add(f);
            }
		}
		System.out.println("\nFibonacci Series upto the "+n+": ");
		for(int i = 0; i < arr.size(); i++){
			if(i == (arr.size() - 1)){
				System.out.print(arr.get(i) + ". ");	
			}
			else{
				System.out.print(arr.get(i) + ", ");
			}
        }
		System.out.println();
	}
}
public class JosephusProblem {
    public static void main(String[] args) {
        int n = 7; // Number of people
        int k = 3; // Step count
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        // Inserting people into the circular linked list
        for (int i = 1; i <= n; i++) {
            list.insert(i);
        }
        // Finding the winner
        CircularDoublyLinkedList.Node winner = list.getWinner(n, k);
        // Printing the winner
        System.out.println("The survivor is at position: " + winner.data);
    }
}
