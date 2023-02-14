package inheritance;
class Sample
{
int a=10;
}
class Single extends Sample
{
void add()
{
System.out.println("having tea estate");
}
}
public class Singlelevel
{
public static void main(String[]args)
{
Single s1=new Single();
s1.add();
System.out.println(s1.a);
}
}