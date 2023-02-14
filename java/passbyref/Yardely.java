class Powder
{
void smell()
{
System.out.println("feel fresh");
}
}
class Yardely
{
public static void main(String[] args)
{
Powder p1=new Powder();
Customer.needsmell(p1);}
}
class Customer{
static void needsmell(Powder p2)
{
p2.smell();
}
}