class Shoe
{
void product()
{
System.out.println("walk continuously");
}
}
class Walk
{
public static void main(String[]args)
{
Shoe s1=new Shoe();
Customer.needproduct(s1);
}
}
class Customer
{
static void needproduct(Shoe s2)
{
s2.product();
}
}