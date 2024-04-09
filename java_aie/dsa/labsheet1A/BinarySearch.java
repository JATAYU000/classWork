import java.util.*;
public class BinarySearch{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the num of elements  :");
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter the element :");
            arr[i]=obj.nextInt();
        }

        int low=0;
        int high=n-1;
        int mid=(high+low)/2;
        System.out.println("Enter the value you would like to search ");
        int key=obj.nextInt();
        while(low<=high){
            System.out.println("Mid is "+mid);
            if(key==arr[mid]) {
                System.out.printf("position of "+key+"is at"+(mid+1));
                break;
            }
            else if(key<arr[mid]){
                high=mid-1;
            }
            else if(key>arr[mid]) {
                low=mid+1;
            }
            else{
                System.out.println("No such element exist in the array");
            }
            mid=(high+low)/2;
        }
    }
}
