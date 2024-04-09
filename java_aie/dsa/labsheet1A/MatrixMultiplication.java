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
        System.out.println("Enter the number of rows:");
        int r2=obj.nextInt();
        System.out.println("Enter the number of columns:");
        int c2=obj.nextInt();
        int[][] arr2=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.println("Enter the ("+i+","+j+")th element :");
                arr2[i][j]=obj.nextInt();
            }
        }
        if(r2 == c){
            int[][] arr3=new int[r][c2];
            for (int i = 0; i < r; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c; k++) {
                    arr3[i][j] += arr[i][k] * arr2[k][j];
                }
            }
            }
            for(int i=0;i<r;i++){
            for(int j=0;j<c2;j++){
                System.out.printf(" "+arr3[j][i]+" ");
            }
            System.out.println();
        }
        }
        
    }
}