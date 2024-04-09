import java.util.*;

public class LinearSearch{
	public static void main(String[] args){

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n=obj.nextInt();
		int[] arr=new int[n];

		for(int i=0;i<n;i++){
			System.out.println("Enter the element:");
			arr[i]=obj.nextInt();
		}

		System.out.println("Enter the element you would like to search :");
		int number=obj.nextInt();

		for(int i=0;i<n;i++){
			if(arr[i]==number){
				System.out.println("The position of element "+number+" is "+(i+1));
			}
		}
	}
}