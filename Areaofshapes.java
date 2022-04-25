public class Areaofshapes
{
public int sum(int x, int y)
{
return (x * y);
}
public double sum(double x, double y)
{
return (0.5*(x*y));
}
public double sum1(double x, double y)
{
return (x + y);
}

public static void main(String args[])
{
Areaofshapes s = new Areaofshapes();
System.out.println(s.sum(10, 20));
System.out.println(s.sum(10, 20));
System.out.println(s.sum1(10,20));
}
}