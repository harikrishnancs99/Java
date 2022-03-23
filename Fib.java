import java.util.*;

class Fib
{
	public static void main(String args[]){
		int max, first=0, second=1, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Fibonacci series: ");
		max = sc.nextInt();
		for(int i = 0;i<max; i++){
			System.out.print(first + " ");
			sum = first + second;
			first = second;
			second = sum;
		}
	}
}