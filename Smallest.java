import java.util.*;




class Smallest

{
	
  public static void main(String args[])
  {
		
     Scanner dp = new Scanner(System.in);
		
     System.out.print("Enter the 1st number: ");
		
     double a = dp.nextDouble();

     System.out.print("Enter the 2nd number: ");
     double b = dp.nextDouble();
     System.out.print("Enter the 3rd number: ");
     double c = dp.nextDouble();	
     if(a<b)
     {
       System.out.print("Smallest:"+a);
     }
     else if(b<c)
     {
       System.out.print("Smallest:"+b);
     }
     else
     {
       System.out.print("Smallest:"+c);
     }
  }

}
