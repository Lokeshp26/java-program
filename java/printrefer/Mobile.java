class Mobile
{
int mobile_cost;
static String mobile_brand="samsung";
String mobile_color;
public static void main(String[]args)
{
System.out.println("mobile brand is"+mobile_brand);
Mobile m1=new Mobile();
m1.mobile_cost=53000;
System.out.println(m1.mobile_cost);
Mobile m2=new Mobile();
m2.mobile_color="blue";
System.out.println(m2.mobile_color);
m1.mobile_cost=20000;
System.out.println(m1.mobile_cost);
}
}
