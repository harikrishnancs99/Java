import java.util.*;

class FibWhile
{
	public static void main(String args[]){
		int max=10, first=0, second=1, sum=0,i=0;
		System.out.println("Fibonacci series of " + max + " numbers:");
		while(i<=max){
			System.out.print(first + " ");
			sum = first + second;
			first = second;
			second = sum;
			i++;
		}
	}
}