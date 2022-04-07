import java.util.*;
public class Swapvariable
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the first number:");
int num1 = s.nextInt();
System.out.println("Enter the second number:");
int num2 = s.nextInt();
int num3;
// Printing values of numbers before swapping in order to see the change
System.out.println("Original values before swapping are:");
System.out.println("Value of number 1 is " +num1); System.out.println("Value of number 2 is " +num2);
num3=num1;
num1=num2;
num2=num3;
// Printing values of numbers after swapping in order to see the change
System.out.println("Values after swapping are:");
System.out.println("Value of number 1 is " +num1); System.out.println("Value of number 2 is " +num2);
}
}