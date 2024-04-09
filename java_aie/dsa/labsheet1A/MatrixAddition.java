import java.util.*;
public class Transpose{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r=obj.nextInt();
        System.out.println("Enter the number of columns:");
        int c=obj.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter the ("+i+","+j+")th element :");
                arr[i][j]=obj.nextInt();
            }
        }
        System.out.println("The next matrix::");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter the ("+i+","+j+")th element :");
                arr[i][j]=arr[i][j] + obj.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf(" "+arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}