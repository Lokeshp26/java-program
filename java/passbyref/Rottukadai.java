class Masalapuri
{
void food()
{
System.out.println("Aarumaih");
}
}
class Rottukadai
{
public static void main(String[]args)
{
Masalapuri m1=new Masalapuri();
Vadikaiyalar.needfood(m1);
}
}
class Vadikaiyalar
{
static void needfood(Masalapuri m2)
{
m2.food();
}
}