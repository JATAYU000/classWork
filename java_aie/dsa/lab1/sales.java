import java.util.*;

class sales{
    static void Average(int[] saleslist){
        double sum= 0;
        for(int i = 0;i<saleslist.length;i++){

           sum = sum + saleslist[i];
        }
        System.out.println("Average: "+ (sum/saleslist.length));
    }

    static void highNlow(int[] saleslist){
        int Hid=1   ;
        int Lid=1;
        int Hsales= saleslist[0];
        int Lsales = saleslist[0];
        for(int i = 0;i<saleslist.length;i++){
            if(saleslist[i]>Hsales){
                Hsales = saleslist[i];
                Hid = i+1;
            }
        }
        for(int i = 0;i<saleslist.length;i++){
            if(saleslist[i]<Lsales){
                Lsales = saleslist[i];

                Lid = i+1;
            }
        }
        System.out.println("Salesperson "+Hid+" has highest sale of "+ Hsales+" sales.");
        System.out.println("Salesperson "+Lid+" has lowest sale of "+ Lsales+" sales.");
    }

    static void ConditionDisplay(int[] saleslist,int threshold){
        int id =1;
        for(int i = 0;i<saleslist.length;i++){
            if(saleslist[i]>=threshold){
                System.out.println("Salesperson "+id+" has "+ saleslist[i]+" sales.");
            }
            id++;
        }
    }

    static int[] AddAt(int[] saleslist ,int ind,int val){
        int[] arr = new int[saleslist.length+1];
        for(int i = 0;i<ind;i++){
            arr[i]= saleslist[i];
        }
        arr[ind] = val;
        for(int i =  ind;i<saleslist.length;i++){
            arr[i+1] = saleslist[i];
        }
        return arr;

    }

    static int[] RemoveAt(int[] saleslist,int ind){
        int[] arr = new int[saleslist.length-1];
        for(int i = 0;i<ind;i++){
            arr[i]= saleslist[i];
        }
        for(int i = ind+1;i<saleslist.length;i++){
            arr[i-1]= saleslist[i];
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of person: ") ;
        int n = obj.nextInt();
        int[] arr = new int[n];
        int avg =0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the sales of person "+ (i+1)+": ");
            int num = obj.nextInt();
            avg+=num;
            arr[i]=num;
        }   
        ConditionDisplay(arr,0);
        Average(arr);
        highNlow(arr); 
        System.out.println("Enter the Threshold sales to display: ") ;
        int value = obj.nextInt();
        ConditionDisplay(arr,value);
        arr = AddAt(arr,1,100);
        ConditionDisplay(arr,0); 
        arr = RemoveAt(arr,1);
        ConditionDisplay(arr,0);
    }
}
