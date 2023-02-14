class Company
{
static void work(int no)
{
System.out.println("no.of work completed"+no);
}
static void work(char id)
{
System.out.println("employees secion"+id);
}
static void work(String product)
{
System.out.println("product based work"+product);
}
static void work(char id,String product,int no)
{
System.out.println("employes section,product based work and number of work completed"+id+" "+product+" "+no);
}
}
class Method4{
public static void main(String[]args)
{
Company.work(4);
Company.work('b');
Company.work("steel");
Company.work('a',"wood",44);
}
}



