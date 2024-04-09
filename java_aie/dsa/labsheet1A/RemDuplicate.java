import java.util.*;
public class Duplicate
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=scan.nextInt();
        int[] arr=new int[n];
        int[] new_arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter the element in arr[%d]",i);
            arr[i]=scan.nextInt();
        }
        System.out.println("Old array:");
        for(int i=-0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr[i+1]){
            new_arr[i]=arr[i];
            }
        }
        System.out.println("New array is :");
        for(int i=0;i<n;i++)
        {
            System.out.println(new_arr[i]);
        }

    }
}