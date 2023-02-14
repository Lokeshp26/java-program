class Sbi
{
void money()
{
System.out.println("money matters");
}
}
class Manager
{
public static void main(String[]args)
{
Sbi s1=new Sbi();
Customer.needmoney(s1);
}
}
class Customer
{
static void needmoney(Sbi s2)
{
s2.money();
}
}