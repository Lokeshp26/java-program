class Vbh
{
void book()
{
System.out.println("read everyday");
}
}
class Book
{
public static void main(String[]args)
{
Vbh b1=new Vbh();
Customer.needbook(b1);
}
}
class Customer
{
static void needbook(Vbh b2)
{
b2.book();
}
}