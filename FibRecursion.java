import java.util.*;

class FibRecursion
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Fibonacci series: ");
		int max = sc.nextInt();
		for(int i = 0;i<=max; i++){
			System.out.print(fibonacciRecursion(i) + " ");
		}
	}

	public static int fibonacciRecursion(int n){
		if(n==0){
			return 0;
		}
		if(n==1 || n==2){
			return 1;
		}
		return fibonacciRecursion(n-2)+fibonacciRecursion(n-1);
	}
}