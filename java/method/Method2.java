class Hosp
{
void treat(char grade)
{
System.out.println("hospital grade"+grade);
}
void treat(int cost)
{
System.out.println("treatment cost"+cost);
}
void treat(String disease)
{
System.out.println("disease cured"+disease);
}
void treat(char grade,int cost,String disease)
{
System.out.println("hospital grade,treatment cost and disease cured"+grade+" "+cost+" "+disease);
}
}
class Method2{
public static void main(String[]args)
{
Hosp h1=new Hosp();
h1.treat('a');
h1.treat(80000);
h1.treat("corona");
h1.treat('b',50000,"omg");
}
}

