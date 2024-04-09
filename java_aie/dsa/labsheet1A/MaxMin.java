import  java.util.*;
public class MaxMin{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int len = obj.nextInt();
		int[] num = new int[len];
		for(int i = 0;i<len; i++){
			System.out.println("Enter "+ (i+1) + "th element:");
			num[i]=obj.nextInt();
		}

		int min = num[0];
		int max = num[0];
 		for(int i = 1;i<len; i++){
			if(num[i]<min){min = num[i];}
			if(num[i]>max){max = num[i];}
		}
		
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}
} 
