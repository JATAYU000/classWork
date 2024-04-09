import java.util.*;
public class Frequency
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
        for(int i=0;i<n;i++){
            new_arr[i]=-1;
        }
        for(int i=0;i<n;i++){
            int c =1;
            if(new_arr[i]==-1){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        new_arr[j]=0;
                        c++;
                    }
                }
                new_arr[i]=c;
            }
        }
        for(int i=0;i<n;i++){
            if(new_arr[i]!=0){
            System.out.println(arr[i]+" has ocurred "+new_arr[i]);
            }
        }
    }

}