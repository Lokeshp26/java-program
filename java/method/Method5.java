class Clg
{
static void study(int no)
{
System.out.println("no.of stu"+no);
}
static void study(String people)
{
System.out.println("subjects having"+people);
}
static void study(String people,int no)
{
System.out.println("subjects having"+people+"no of stu"+no);
}
static void study(int no,String people)
{
System.out.println("no of student"+no+"subject having"+people);
}
}
class Method5{
public static void main(String[]args)
{
Clg.study(8);
Clg.study("secondary");
Clg.study("higher",12);
Clg.study(5+"primary");
}
}