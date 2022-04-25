import java.util.*;

interface Demo
{
	Double area();
	Double peremeter();	
}

class Rectangle implements Demo{
	int len;
	int breadth;
	Rectangle(int len, int breadth){
		this.len = len;
		this.breadth = breadth;
	}
	public Double area(){
		return Double.valueOf(len * breadth);
	}
	public Double peremeter(){
		return Double.valueOf(2*(len+breadth));
	}
}

class Circle implements Demo{
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
	public Double area(){
		return(Math.PI * radius * radius);
	}
	public Double peremeter(){
		return(2 * Math.PI * radius);
	}
}

class Interface{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while(choice != 3)
		{
		System.out.println("\nSelect Shape \n1.Rectangle 2.Circle 3.Exit");
		choice = sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("\nEnter the length of rectangle: ");
				int len = sc.nextInt();
				System.out.println("Enter the breadth of rectangle: ");
				int bre = sc.nextInt();

				Rectangle rec = new Rectangle(len, bre);
				System.out.println("\nArea\t: "+rec.area());
				System.out.println("\nPerimeter\t: "+rec.peremeter());
				break;
			case 2:
				System.out.println("\nEnter the radius of circle: ");
				int radius = sc.nextInt();

				Circle cir = new Circle(radius);
				System.out.println("\nArea\t: "+cir.area());
				System.out.println("\nPerimeter\t: "+cir.peremeter());
				break;
			case 3:
				System.out.println("\nExiting.....");
				break;
			default:
				System.out.println("Wrong choice");
				break;
		}
		}
	}
}