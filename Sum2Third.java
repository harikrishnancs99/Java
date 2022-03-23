import java.util.*;

class Sum2Third
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int first = sc.nextInt();
		System.out.print("Enter the second number: ");
		int second = sc.nextInt();
		System.out.print("Enter the third number: ");
		int third = sc.nextInt();
		System.out.print("The result is : " + SumOfTwo(first, second, third));
	}

	public static boolean SumOfTwo(int p, int q, int r){
		return((p+q)==r || (q+r)==p || (r+p)==q);
	}
}
