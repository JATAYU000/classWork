import  java.util.*;
public class reverse{
	public static void main(String[] args){
		//ArrayList<int> numbers = new ArrayList<Int>();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int len = obj.nextInt();
		int[] num = new int[len];
		int[] rev  =new int[len]; 
		for(int i = 0;i<len; i++){
			System.out.println("Enter "+ (i+1) + "th element:");
			num[i]=obj.nextInt();
		}

		int sum = 0;
 		for(int i = 0;i<len; i++){
			rev[i]=num[len-i-1];
		}
		
		for(int i = 0;i<len; i++){
			System.out.print(" "+ rev[i] + " ");
		}
	}
} 
