class Candy
{
void product()
{
System.out.println("feel the taste");
}
}
class Mitai
{
public static void main(String[]args)
{
Candy c1=new Candy();
Customer.needproduct(c1);
}
}
class Customer
{
static void needproduct(Candy c2)
{
c2.product();
}
}