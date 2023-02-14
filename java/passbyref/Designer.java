class Cloth
{
void product()
{
System.out.println("wear neatly");
}
}
class Designer
{
public static void main(String[]args)
{
Cloth c1=new Cloth();
Customer.needproduct(c1);
}
}
class Customer
{
static void needproduct(Cloth c2)
{
c2.product();
}
}