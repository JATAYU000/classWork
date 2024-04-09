import java.util.*;
public class Diagonal{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows in the square matrix:");
        int r=obj.nextInt();
        int[][] arr=new int[r][r];
        int sum = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                System.out.println("Enter the ("+i+","+j+")th element :");
                arr[i][j]=obj.nextInt();
                if(i==j){
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal matrix: "+ sum);
    }
}