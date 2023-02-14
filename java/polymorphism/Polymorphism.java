class Karish
{
void beauty()
{
System.out.println("god's own daughter !! ");
}
}
class Missuni extends Karish
{
void beauty()
{
System.out.println(" she inherit from mah queen");
}
}
class Missind extends Karish
{
void beauty()
{
System.out.println("never equals to karish");
}
}
class Misstn extends Karish
{
void beauty()
{
System.out.println("beauty queen karishma ki jai.. ");
}
}
class Gorgeous
{
static void cute(Karish g1)
{
g1.beauty();
}
}
class Polymorphism
{
public static void main(String[]args)
{
Missuni m1=new Missuni();
Missind m2=new Missind();
Misstn m3=new Misstn();
Gorgeous.cute(m1);
Gorgeous.cute(m2);
Gorgeous.cute(m3);
}
}
