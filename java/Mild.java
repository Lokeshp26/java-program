class Swiggy
{
void order()
{
System.out.println("foodie");
}
}
class Pizza extends Swiggy
{
void order()
{
System.out.println("pizza is junk");
}
}
class Idly extends Swiggy
{
void order()
{
System.out.println("idly is evergreen");
}
}
class Sti
{
static void add(Swiggy s1)
{
s1.order();
}
}
class Mild
{
public static void main(String[]args)
{
Pizza p1=new Pizza();
Idly l1=new Idly();
Sti.add(p1);
Sti.add(l1);
}
}