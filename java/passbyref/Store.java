class Lenovo
{
void product()
{
System.out.println("latest version");
}
}
class Store
{
public static void main(String[]args)
{
Lenovo u1=new Lenovo();
Customer.needproduct(u1);
}
}
class Customer
{
static void needproduct(Lenovo u2)
{
u2.product();
}
}