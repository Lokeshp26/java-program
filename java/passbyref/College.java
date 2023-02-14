class Uni
{
void exam()
{
System.out.println("all pass");
}
}
class College
{
public static void main(String[]args)
{
Uni u1=new Uni();
Student.needexam(u1);
}
}
class Student
{
static void needexam(Uni u2)
{
u2.exam();
}
}