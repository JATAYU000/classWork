import java.util.*;
public class Circle{
	private double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double area(){
		return 3.14*this.radius*this.radius;
	}
	public double circum(){
		return 6.28*this.radius;
	}
	public String toString(){
	return "Radius: " + this.radius + "\nArea: "+ this.area()+"\nCircum: "+this.circum() ;

	}
	public static void main(String[] args){
		Circle c1 = new Circle(50);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(20);
		System.out.println("Circle 1:");
		System.out.println(c1.toString());
		System.out.println("Circle 2:");
		System.out.println(c2.toString());
		System.out.println("Circle 3:");
		System.out.println(c3.toString());
		}

}
