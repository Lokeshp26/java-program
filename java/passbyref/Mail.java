class Gmail
{
void msg()
{
System.out.println("inter connectedness");
}
}
class Mail
{
public static void main(String[]args)
{
Gmail g1=new Gmail();
People.needmsg(g1);
}
}
class People
{
static void needmsg(Gmail s2)
{
s2.msg();
}
}