class Train
{
void ticket()
{
System.out.println("Hpy Journey!!");
}
}
class Platform
{
public static void main(String[]args)
{
Train t1=new Train();
Passanger.needticket(t1);
}
}
class Passanger
{
static void needticket(Train t2)
{
t2.ticket();
}
}