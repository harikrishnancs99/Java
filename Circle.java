import java.util.*;



class Circle

{
	
  public static void main(String args[])
  {
		
     Scanner dp = new Scanner(System.in);
		
     System.out.print("Enter the radius: ");
		
     double rad = dp.nextDouble();
		
     System.out.println("Area = "+ (Math.PI * rad * rad));
		
     System.out.println("Perimeter = "+ (2 * Math.PI * rad));
	
  }

}
