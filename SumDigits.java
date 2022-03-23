import java.util.*;


class SumDigits
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		long number = sc.nextLong();
		System.out.println("Sum of digits = " + sum_digits(number));
	}

	public static int sum_digits(long num){
		int sum = 0;
		while(num!=0)
		{
			sum += num % 10;
			num/=10;
		}
		return sum;
	}
}
