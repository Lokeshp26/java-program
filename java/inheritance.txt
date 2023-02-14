class Hospi
{
void treat()
{
System.out.println("good");
}
}
class Phar1 extends Hospi
{
int a=10;
}
class Phar2 extends Hospi
{
int b=20;
}
class Med extends Phar1
{
void cure()
{
System.out.println("not bad ");
}
}
class Hybrid
{
public static void main(String[]args)
{
Phar2 p2=new Phar2();
System.out.println(p2.b);
p2.treat();
Med c1=new Med();
c1.treat();
System.out.println(c1.a);
c1.cure();
}
}
