class Apollo
{
void medicine()
{
System.out.println("cure quickly");
}
}
class Medplus
{
public static void main(String[]args)
{
Apollo a1=new Apollo();
Customer.needmedicine(a1);
}
}
class Customer
{
static void needmedicine(Apollo a2)
{
a2.medicine();
}
}