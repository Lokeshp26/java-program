class Movie
{
void ticket()
{
System.out.println("enjoy the experience");
}
}
class Bookmyshow
{
public static void main(String[]args)
{
Movie m1=new Movie();
Customer.needticket(m1);
}
}
class Customer
{
static void needticket(Movie m2)
{
m2.ticket();
}
}