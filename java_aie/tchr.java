import java.util.*;
public class Teacher{
    String name;
	int age;
    String course;
    int mark;


    Teacher(String nam,int ag,String cours,int mar = null){
        name = nam;
        age = ag;
        course = cours;
        mark =mar;
    }

    void displayInfo(Teacher t1,Teacher t2,Teacher t3,){
        System.out.print("\nTeacher Detail 1:\nName: "+t1.name+"\nAge: "+t1.age+"\nCourse: "+t1.course+"\n")
        if(t1.mark==null){}
        else {System.out.print("Marks: "+t1.mark+"\n");}
        System.out.println();
        System.out.print("\nTeacher Detail 2:\nName: "+t2.name+"\nAge: "+t2.age+"\nCourse: "+t2.course+"\n")
        if(t1.mark==null){}
        else {System.out.print("Marks: "+t2.mark+"\n");}
        System.out.println();
        System.out.print("\nTeacher Detail 3:\nName: "+t3.name+"\nAge: "+t3.age+"\nCourse: "+t3.course+"\n")
        if(t1.mark==null){}
        else {System.out.print("Marks: "+t3.mark+"\n");}
        System.out.println();
        
    }

    Teacher setCource(Teacher t, String cour){
        t.course = cour;
        return t;
    }

    Teacher addMark(Teacher t,int mar){
        t.mark = mar;
        return t;
    }

    Teacher setMark(Teacher t,int mar){
        t.mark = mar;
        return t;
    }

    public static void main(String[] args){
        System.out.println("------------ISHKOOL---------------");
		Scanner obj = new Scanner(System.in);
		int a = 1;
        Teacher t1 = new Teacher("ragav",20,"Java");
        Teacher t2 = new Teacher("Tina",30,"Maths");
        Teacher t3 = new Teacher("Ram",25,"Java");
		while(a==1){

              
        }
    }
}