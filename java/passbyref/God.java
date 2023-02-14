class Spirit
{
void virtual()
{
System.out.println("after death");
}
}
class God
{
public static void main(String[]args)
{
Spirit s1=new Spirit();
Peoples.needvirtual(s1);
}
}
class Peoples
{
static void needvirtual(Spirit s2)
{
s2.virtual();
}
}