import java.util.*;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        System.out.println();
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter the element : ");
            arr.add(sc.nextInt());
        }
        for(int i = 0; i < arr.size(); i++)
        {
            for(int j = i + 1; j < arr.size(); j++)
            {
                if(arr.get(i) == arr.get(j))
                {
                    arr.remove(j);
                    j--;
                }
            }
        }
        System.out.println("\nThe array after removing duplicates : ");
        System.out.println(arr);
    }
}
