import java.util.*;


class Product
{
	public static void main(String args[]){
		Scanner dp = new Scanner(System.in);
		int a,b;
		System.out.print("Enter the first number: ");
		a = dp.nextInt();
		System.out.print("Enter the second number: ");
		b = dp.nextInt();
		int prod = a*b;
		System.out.println("Product = " + prod);
	}
}
