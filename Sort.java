import java.util.*;

class Sort
{
	public static void main(String args[]){
		int[] int_array = {10, 234, 111, 555, 107, 234, 111, 555};
		String[] str_array = {"Java", "Python", "PHP", "C#", "C", "C++"};
		System.out.println("Original numeric array :"+ Arrays.toString(int_array));

		Arrays.sort(int_array);
		System.out.println("Sorted numeric array :"+ Arrays.toString(int_array));

		System.out.println("Original string array :"+ Arrays.toString(str_array));

		Arrays.sort(str_array);
		System.out.println("Sorted string array :"+ Arrays.toString(str_array));
	}
}
