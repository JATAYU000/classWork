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

		int j = num[0];
		boolean is = true;
 		for(int i = 0;i<len; i++){
			if(j>num[i]){is = false;break;}
		}
		
		System.out.println("is Sorted?: "+is);
		
	}
} 
