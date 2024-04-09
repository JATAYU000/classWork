import java.util.*;
public class Rectangle{
	double length;
	double breadth;

	Rectangle(double l, double b){
		length=l;
		breadth = b;
	}

	double area(){
		return (length*breadth);
	}

	double perimeter(){
		return (2*(length+breadth));
	}

	boolean isSquare(){
		if(length==breadth){
			return true;
		}
		return false;
	}


	public static void main(String[] args)
	{
		System.out.println("------------RECTANGLE---------------");
		Scanner obj = new Scanner(System.in);
		int a = 1;
		while(a==1){
			double l,b;
			System.out.println("Enter the length: ");
			l = obj.nextDouble();
			System.out.println("Enter the breadth: ");
			b = obj.nextDouble();
			Rectangle bj = new Rectangle(10.0,20.0);
			if(l==0.0 || b==0.0){
				System.out.println("0? seriously...");
				System.out.println();
				continue;
			} else{ 
				bj = new Rectangle(l,b);
			}
			

			System.out.println("Area is = "+bj.area()+ " m^2");
			System.out.println("Perimeter is = " + bj.perimeter()+ " m");
			System.out.println("Is it a Square? " + bj.isSquare());

			System.out.println("Do you wish to continue ( hit 1):");
			a = obj.nextInt();
			System.out.println();
			System.out.println();

	}
}



}

