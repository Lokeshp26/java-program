class Groceary
{
void product()
{
System.out.println("Eat well :");
}
}
class Bigbasket
{
public static void main(String[]args)
{
Groceary g1=new Groceary();
Customer.needproduct(g1);
}
}
class Customer
{
static void needproduct(Groceary g2)
{
g2.product();
}
}