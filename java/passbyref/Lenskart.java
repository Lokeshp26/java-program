class Specs
{
void product ()
{
System.out.println("clear vision");
}
}
class Lenskart
{
public static void main(String[]args)
{
Specs s1=new Specs();
Customer.needproduct(s1);
}
}
class Customer
{
static void needproduct(Specs s2)
{
s2.product();
}
} 