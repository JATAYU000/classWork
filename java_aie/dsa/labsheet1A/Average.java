import  java.util.*;
public class Average{
	public static void main(String[] args){
		//ArrayList<int> numbers = new ArrayList<Int>();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int len = obj.nextInt();
		int[] num = new int[len];
		for(int i = 0;i<len; i++){
			System.out.println("Enter "+ (i+1) + "th element:");
			num[i]=obj.nextInt();
		}

		int sum = 0;
 		for(int i = 0;i<len; i++){
			sum = sum + num[i];
		}
		
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+(sum/len));
	}
} 
