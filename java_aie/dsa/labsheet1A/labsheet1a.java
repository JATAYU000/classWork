import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class labsheet1a {

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Question 1 & 2
        System.out.println("Enter the number of elements : ");
        int numElements = scan.nextInt();
        int[] arr_1 = new int[numElements];
        int sum = 0;
        for (int i=0;i<numElements;i++) {
            System.out.println("Enter the "+i+" th element : ");
            arr_1[i] = scan.nextInt();
            sum +=arr_1[i];
        }

        System.out.println();

        for (int i = 0; i<numElements; i++) {
            System.out.print(arr_1[i]+",");
        }

        int avgElements = sum/arr_1.length;

        System.out.println();
        System.out.println("Sum is : "+sum);
        System.out.println("Average is : "+avgElements);

        int maxNum = arr_1[0];
        int minNum = arr_1[0];
        for (int j=0;j<arr_1.length;j++) {
            if (arr_1[j]>maxNum){
                maxNum = arr_1[j];
            }
            else {
                minNum = arr_1[j];
            }
        }

        System.out.println();
        System.out.println("Maximum element is "+maxNum);
        System.out.println("Minimum element is "+minNum);
        

        // Question 3
        int[] tempArr = new int[numElements];
        int j = 0;

        for (int i = numElements; i>0; i--) {
            tempArr[j] = arr_1[(i-1)];
            j++;
        }

        arr_1 = tempArr;

        System.out.println();
        for (int i = 0; i<numElements; i++) {
            System.out.print(arr_1[i]+",");
        }
        System.out.println();

        
        // Question 4
        boolean ascending = true;

        for (int i = 1; i<numElements; i++) {
            if (arr_1[(i)]>arr_1[i-1]){
                ascending = true;
            }
            else {
                ascending = false;
            }
        }

        if (ascending == true) {
            System.out.println("The array is in ascending order.");
        }
        else if (ascending == false) {
            System.out.println("The array is in descending order.");
        }

        int[] nonRepeatElements = new int[5];

        for (int i = 0; i<numElements; i++) {
            for (int k = 0; k<numElements; k++)   {
                if (arr_1[i] != arr_1[k]) {
                    
                }
            }    
        }
        
        // Question 5
        int[] uniqueArr = new int[arr_1.length];
        int index = 0;
        int nIndex = 0;
        for (int i = 0; i < arr_1.length; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < index; k++) {
                if (arr_1[i] == uniqueArr[k]) {
                    isDuplicate = true;
                    nIndex++;                    
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArr[index++] = arr_1[i];
            }
        }

        int[] arr_2 = new int[arr_1.length-nIndex];

        for (int ik = 0; ik < arr_1.length-nIndex; ik++) {
            arr_2[ik] = uniqueArr[ik];
        }
        
        System.out.println();
        System.out.println("Array after removing duplicates : " + Arrays.toString(arr_2));


        // Question 6
        int[] mergeArr = new int[arr_1.length+arr_2.length];

        int indexCount = 0;
        for (int ij = 0; ij < arr_1.length; ij++) {
            mergeArr[ij] = arr_1[ij];
            indexCount++;
        }

        int arr2index = 0;
        for (int il = indexCount; il < arr_1.length+arr_2.length; il++) {
            mergeArr[il] = arr_2[arr2index];
            arr2index++;
        }

        System.out.println();
        System.out.println("Merged arrays : " + Arrays.toString(mergeArr));


        // Question 7
        int[] freArr = new int[arr_1.length];
      
        for (int kl = 0;kl<arr_1.length;kl++) {
            for (int km = 0;km<arr_1.length;km++) {
                if (arr_1[kl] == arr_1[km]) {
                    freArr[kl]++;
                } 
            }
        }

        System.out.println();
        for ( int lk = 0; lk<arr_1.length;lk++) {
            System.out.println("The frequency of "+arr_1[lk]+" is "+freArr[lk]);
        }

        // Question 8
        int[] arr = new int[9];

        System.out.println();
        System.out.println("Enter 9 elements :");
        for (int i = 0; i < 9; i++) {
            System.out.println("Enter element "+i+" : ");
            arr[i] = scan.nextInt();
        }


        // Q8.a
        System.out.println();
        System.out.println("Linear Search :");
        int pos13 = -1, pos28 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) {
                pos13 = i;
            }
            if (arr[i] == 28) {
                pos28 = i;
            }
        }
        System.out.println("Position of 13 : " + pos13);
        System.out.println("Position of 28 : " + pos28);


        // Q8.c
        for (int i = 0; i < arr.length - 1; i++) {
            for (int jf = 0; jf < arr.length - i - 1; jf++) {
                if (arr[jf] > arr[jf + 1]) {
                    int temp = arr[jf];
                    arr[jf] = arr[jf + 1];
                    arr[jf + 1] = temp;
                }
            }
        }

        
        // Q8.b
        System.out.println("\nBinary Search :");
        int low = 0, high = arr.length - 1;
        int pos21 = -1, pos89 = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("Mid value : " + arr[mid] + " at index : " + mid);
            if (arr[mid] == 21) {
                pos21 = mid;
                break;
            } else if (arr[mid] < 21) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("Mid value : " + arr[mid] + " at index : " + mid);
            if (arr[mid] == 89) {
                pos89 = mid;
                break;
            } else if (arr[mid] < 89) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println();
        System.out.println("Position of 21 : " + pos21);
        System.out.println("Position of 89 : " + pos89);



        // Question 9
        System.out.println();
        System.out.print("Enter the number of rows : ");
        int rows = scan.nextInt();
        System.out.print("Enter the number of columns : ");
        int col = scan.nextInt();

        int[][] matrix = new int[rows][col];

        System.out.println();
        System.out.println("Enter the elements of first matrix :");
        for (int i = 0; i < rows; i++) {
            for (int jn = 0; jn < col; jn++) {
                System.out.println("Enter element ("+i+","+jn+") : ");
                matrix[i][jn] = scan.nextInt();
            }
        }

        System.out.println();
        System.out.println("Original Matrix : ");
        printMatrix(matrix);

        // Q9.a
        System.out.println();
        System.out.println("Transpose :");
        int[][] tMat = new int[col][rows];
        for (int i = 0; i < rows; i++) {
            for (int jv = 0; jv < col; jv++) {
                tMat[jv][i] = matrix[i][jv];
            }
        }
        printMatrix(tMat);

        // Q9.b
        int diaSum = 0;
        for (int i = 0; i < rows && i < col; i++) {
            diaSum += matrix[i][i];
        }
        System.out.println();
        System.out.println("Sum of diagonals : " + diaSum);

        // Q9.c
        System.out.println();
        System.out.println("Enter the second matrix for addition :");
        int[][] seMat = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int jc = 0; jc < col; jc++) {
                System.out.println("Enter element ("+i+","+jc+") : ");
                seMat[i][jc] = scan.nextInt();
            }
        }

        System.out.println();
        System.out.println("Sum of matrices :");
        int[][] sumMat = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int ja = 0; ja < col; ja++) {
                sumMat[i][ja] = matrix[i][ja] + seMat[i][ja];
            }
        }
        System.out.println();
        printMatrix(sumMat);

        // Q9.d
        System.out.println();
        System.out.println("Enter the second matrix for multiplication :");
        System.out.println();
        System.out.println("Enter the number of rows for the second matrix : ");
        int secRows = scan.nextInt();
        System.out.println("Enter the number of columns for the second matrix : ");
        int secCol = scan.nextInt();
        if (col != secRows) {
            System.out.println("Multiplication not possible!");
        } else {
            int[][] secInMat = new int[secRows][secCol];
            System.out.println("Enter the elements of the second matrix :");
            for (int i = 0; i < secRows; i++) {
                for (int jb = 0; jb < secCol; jb++) {
                    System.out.println("Enter element ("+i+","+jb+") : ");
                    secInMat[i][jb] = scan.nextInt();
                }
            }
            int[][] pMat = new int[rows][secCol];
            for (int i = 0; i < rows; i++) {
                for (int ja = 0; ja < secCol; ja++) {
                    for (int k = 0; k < col; k++) {
                        pMat[i][ja] += matrix[i][k] * secInMat[k][ja];
                    }
                }
            }
            System.out.println();
            System.out.println("Product of matrices :");
            printMatrix(pMat);
        }
    

        // Question 10
        ArrayList<Integer> fibonacci = new ArrayList<>();
        
        fibonacci.add(0);
        fibonacci.add(1);
        
        int in = 2;
        while (true) {
            int nextFib = fibonacci.get(in - 1) + fibonacci.get(in - 2);
            if (nextFib <= 50) {
                fibonacci.add(nextFib);
                in++;
            } else {
                break;
            }
        }
        
        System.out.println();
        System.out.println("Fibonacci series up to 50 : ");
        for (int num : fibonacci) {
            System.out.print(num + ",");
        }
        System.out.println();


        // Question 11
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(3);
        
        System.out.println();
        System.out.println("With duplicates : " + list1);
        
        int size = list1.size();
        for (int i = 0; i < size; i++) {
            int curEle = list1.get(i);
            for (int jy = i + 1; jy < size; jy++) {
                if (list1.get(jy) == curEle) {
                    list1.remove(jy);
                    size--;
                    jy--;
                }
            }
        }
        
        System.out.println();
        System.out.println("Without duplicates : " + list1);


        // Question 12
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(4);
        list3.add(5);
        list3.add(6);
        
        ArrayList<Integer> interSec = new ArrayList<>();
        
        for (Integer num1 : list2) {
            for (Integer num2 : list3) {
                if (num1.equals(num2)) {
                    interSec.add(num1);
                    break;
                }
            }
        }
        
        System.out.println();
        System.out.println("Intersection :");
        for (Integer num : interSec) {
            System.out.print(num + " ");
        }
        System.out.println();

        scan.close();
    }
}