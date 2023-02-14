class Railway
{
void ticket()
{
System.out.println("happy journey");
}
}
class Irctc
{
public static void main(String[]args)
{
Railway r1=new Railway();
Customer.needticket(r1);
}
}
class Customer
{
static void needticket(Railway r2)
{
r2.ticket();
}
}