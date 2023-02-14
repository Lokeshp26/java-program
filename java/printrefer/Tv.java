class Tv
{
int tvcost;
static String tvbrand="realme";
String tvtype;
public static void main(String[]args)
{ 
System.out.println(tvbrand);
Tv t1=new Tv();
t1.tvtype="android";
System.out.println(t1.tvtype);
Tv t2=new Tv();
t2.tvcost=43567;
System.out.println(t2.tvcost);
t1.tvtype="led";
System.out.println(t1.tvtype);
}
}