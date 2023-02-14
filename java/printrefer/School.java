class School
{
static String school_name="svhss";
String school_grade;
int school_strenth;
public static void main(String[]args)
{
System.out.println("school name is"+school_name);
School s1=new School();
s1.school_grade="a";
System.out.println(s1.school_grade);
School s2=new School();
s2.school_strenth=2000;
System.out.println(s2.school_strenth);
s1.school_grade="b";
System.out.println(s1.school_grade);
}
}