import java.util.*;

class CountSymbol
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String test = "Aa.........";
		count(test);
	}
	
	public static void count(String str){
		char[] ch = str.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i=0; i<str.length(); i++){
			if(Character.isLetter(ch[i])){
				letter++;
			}
			else if(Character.isDigit(ch[i])){
				num++;
			}
			else if(Character.isSpaceChar(ch[i])){
				space++;
			}
			else other++;
		}
		System.out.println("The String is :" + str);
		System.out.println("Letter: " + letter);
		System.out.println("Number :" + num);
		System.out.println("Other :" + other);
	}
}
