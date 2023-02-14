class Sample
{
double area(int r);
{
final double pi=3.142;
double res=(pi*r*r);
System.out.println(res);
}
public static void main(String[]args)
{
Sample s1=new Sample();
s1.area(6);
}
}