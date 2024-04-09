import java.util.*;
public class MergeTwoSort
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array");
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter the element:");
            arr[i]=scan.nextInt();
        }

        System.out.println("Enter the number of elements in the second array");
        int m=scan.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            System.out.printf("Enter the element");
            arr2[i]=scan.nextInt();
        }

        int[] arrMerged = new int[n+m];
        
        for(int i = 0 ;i<n; i++){
            arrMerged[i]=arr[i];
        }
        int ind = 0;
        for(int i = n;i<n+m;i++){
            arrMerged[i]=arr2[ind];
            ind++;
        }
        for(int i=0;i<n+m;i++){
            System.out.printf(" "+arrMerged[i]+" ");
        }
    }
}