public class Sales{
    static void Average(ArrayList<Integer> salselist){
        double sum= 0;
        for(int i = 0;i<salselist.size();i++){

           sum = sum + salselist.get(i);
        }
        System.out.println("Average: "+ (sum/salselist.size()));
    }

    static void highNlow(ArrayList<Integer> salselist){
        int Hid=0;
        int Lid=0;
        int Hsales= salselist.get(0);
        int Lsales = salselist.get(0);
        for(int i = 0;i<salselist.size();i++){
            if(salselist.get(i)>Hsales){
                Hsales = salselist.get(i);
                Hid = i+1;
            }
        }
        for(int i = 0;i<salselist.size();i++){
            if(salselist.get(i)<Lsales){
                Lsales = salselist.get(i);
                Lid = i+1;
            }
        }
        System.out.println("Salesperson "+Hid+" has highest sale of "+ Hsales+" sales.");
        System.out.println("Salesperson "+Lid+" has lowest sale of "+ Lsales+" sales.");
    }

    static void ConditionDisplay(ArrayList<Integer> salselist,int threshold){
        int id =0;
        for(int i = 0;i<salselist.size();i++){
            if(salselist.get(i)>=threshold){
                System.out.println("Salesperson "+id+" has "+ salselist.get(i)+" sales.");
            }
            id++;
        }
    }

    static ArrayList<Integer> AddAt(ArrayList<Integer> salselist){
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter id to add to: ");
        int id = obj.nextInt();
        System.out.println("Enter the sales: ");
        int sales = obj.nextInt();
        System.out.println("Added Salesperson...");
        salselist.add(id-1,sales);
        return salselist;
    }


    static ArrayList<Integer> RemoveAt(ArrayList<Integer> salselist,int id){
        salselist.remove(id-1);
        return salselist;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of person: ") ;
        int n = obj.nextInt();
        ArrayList<Integer> salselist = new ArrayList<>();
        int avg = 0;
        int num;
        for(int i=0;i<n;i++){
            System.out.println("Enter the sales of person "+ (i+1)+": ");
            num = obj.nextInt();
            avg+=num;
            salselist.add(num);
        }
        Display(salselist);
        System.out.println();
        Average(salselist);
        System.out.println();
        highNlow(salselist);
        System.out.println();
        System.out.println("Enter the Threshold sales to display: ") ;
        int value = obj.nextInt();
        ConditionDisplay(salselist,value);
        System.out.println();
        salselist = AddAt(salselist);
        salselist = AddAt(salselist);
        salselist = AddAt(salselist);
        Display(salselist);
        System.out.println();
        
        salselist = RemoveAt(salselist,2);
        System.out.println("Deleted id 2, replaced...");
        Display(salselist);
    }
}