class Liberty
{
void product()
{
System.out.println("walk continuously");
}
}
class Footwear
{
public static void main(String[]args)
{
Liberty l1=new Liberty();
Customer.needproduct(l1);
}
}
class Customer
{
static void needproduct(Liberty l2)
{
l2.product();
}
}