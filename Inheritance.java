import java.util.*;

class Person
{
	String name, address, gender;
	int age;
	
	Person(String name, String gender, String address, int age){
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
	}

	public void show(){
		System.out.println("address: " + address + "\ngender: " + gender + "\nage: " + age);
	}
}

class Employee extends Person{
	int empid;
	String name;
	String qualification;
	int salary;

	Employee(int empid, String name, String qual, int salary, String p_gender, String p_address, int p_age){
		super(name, p_gender, p_address, p_age);

		this.empid = empid;
		this.name = name;
		this.qualification = qual;
		this.salary = salary;
	}

	public void show(){
		System.out.println("empid: " + empid + "\name: " + name + "\nqual: " + qualification + "\nsalary: " + salary);
		super.show();
	}
}

class Teacher extends Employee{
	String subject;
	String department;
	int teacher_id;
	
	Teacher(int teacher_id, String department, String subject, int empid, String e_name, String e_qual, int e_salary, String p_gender, String p_address, int p_age){
		super(empid, e_name, e_qual, e_salary, p_gender, p_address, p_age);

		this.teacher_id = teacher_id;
		this.department = department;
		this.subject = subject;
	}
	
	public void show(){
		System.out.println("\nDetails are \nsubject: " + subject + "\ndepartment: " + department + "\nteacherid: " + teacher_id);
		super.show();
	}
}

class Inheritance{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Empid: ");
		int empid = Integer.parseInt(sc.nextLine());
	
		System.out.println("Teacherid: ");
		int teacherid = Integer.parseInt(sc.nextLine());		

		System.out.println("Name: ");
		String name = sc.nextLine();

		System.out.println("Gender: ");
		String gender = sc.nextLine();

		System.out.println("Address: ");
		String address = sc.nextLine();

		System.out.println("Age: ");
		int age = Integer.parseInt(sc.nextLine());

		System.out.println("Qualification: ");
		String qualification = sc.nextLine();

		System.out.println("Salary: ");
		int salary = Integer.parseInt(sc.nextLine());

		System.out.println("Subject: ");
		String subject = sc.nextLine();

		System.out.println("Department: ");
		String department = sc.nextLine();

		Teacher th = new Teacher(teacherid, department, subject, empid, name, qualification, salary, gender, address, age);
		th.show();
	}
}