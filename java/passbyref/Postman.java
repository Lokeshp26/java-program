class Post
{
void letters ()
{
System.out.println("delivering");
}
}
class Postman
{
public static void main(String[]args)
{
Post p1=new Post();
Customer2.needletters(p1);
}
}
class Customer2
{
static void needletters(Post p2)
{
p2.letters();
}
}