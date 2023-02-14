class Htmlh4
{
void style()
{
System.out.println("text formats are imported");
}
}
class Htmlh5 extends Htmlh4
{
void style()
{
System.out.println("now image,audio and video formats are also imported");
}
}
class Main
{
public static void main(String[]args)
{
Htmlh5. h5=new Htmlh5();
h5.style();
}
}