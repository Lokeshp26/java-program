class Hospi1
{
void treat()
{
System.out.println("text formats are imported");
}
}
class Hospi2 extends Hospi1
{
void treat()
{
System.out.println("now image,audio and video formats are also imported");
super.treat();
}
}
class Overriding
{
public static void main(String[]args)
{
Hospi2 h2=new Hospi2();
h2.treat();
}
}