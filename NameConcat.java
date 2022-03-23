import java.util.*;

class NameConcat
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstname, lastname;
		firstname = sc.nextLine();
		System.out.println("Enter your last name: ");
		lastname = sc.nextLine();

		System.out.println("Full Name: " + firstname + " " + lastname);
	}
}
