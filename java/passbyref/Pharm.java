class Medicine
{
void product()
{
System.out.println("emergency");
}
}
class Pharm
{
public static void main(String[]args)
{
Medicine u1=new Medicine();
Customer.needproduct(u1);
}
}
class Customer
{
static void needproduct(Medicine u2)
{
u2.product();
}
}