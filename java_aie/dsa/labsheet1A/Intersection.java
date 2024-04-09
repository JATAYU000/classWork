import java.util.*;

public class Intersection
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of elements of the first array : ");
        int n1 = sc.nextInt();
        System.out.println();
        for(int i = 0; i < n1; i++)
        {
            System.out.print("Enter the element : ");
            arr1.add(sc.nextInt());
        }
        System.out.print("\nEnter the number of elements of the second array: ");
        int n2 = sc.nextInt();
        System.out.println();
        for(int i = 0; i < n2; i++)
        {
            System.out.print("Enter the element : ");
            arr2.add(sc.nextInt());
        }
        for(int i = 0; i < arr1.size(); i++)
        {
            if(arr2.contains(arr1.get(i)))
            {
                arr3.add(arr1.get(i));
            }
        }
        System.out.println("\nThe intersection of two arrays : ");
        System.out.println(arr3);
    }
}
