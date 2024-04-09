import java.util.*;
public class BubbleSort{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter the element :");
            arr[i]=obj.nextInt();
            System.out.println();
        }
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                } 
            }
        } 
        for(int i=0;i<n;i++){
            System.out.printf(" "+arr[i]+" ");
        }
    }
}
 
