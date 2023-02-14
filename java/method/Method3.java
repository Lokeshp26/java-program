class Mail
{
void send(int no)
{
System.out.println("no.of msg"+no);
}
void send(String type)
{
System.out.println("content it can hold"+type);
}
void send(String type,int no)
{
System.out.println("content it can hold"+type+"number of msg"+no);
}
}
class Method3{
public static void main(String[]args)
{
Mail m1=new Mail();
m1.send(4);
m1.send("formal");
m1.send("informal",5);
}
}



