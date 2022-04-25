import java.util.*;
class stringmanipulation
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the 1st string: ");
		String str=obj.nextLine();
		System.out.print("Enter the 2nd string: ");
		String str2=obj.nextLine();
		System.out.println("Concatenation of string");
		String str3=str.concat(str2);
		System.out.println(str3);
		System.out.println("Length of the 1st string: "+str.length());
		System.out.println("character at positon 4 in 1st string: "+str2.charAt(2));
		System.out.println("Index of character 'd' in 2nd string: "+str2.indexOf('d'));
		System.out.println("convert to,Lowercase: "+str3.toLowerCase());
		System.out.println("convert to,Uppercase: "+str3.toUpperCase());
		
	}
}