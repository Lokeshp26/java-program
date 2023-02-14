class Movie
{
static void disp(int no)
{
System.out.println("duration time"+no);
}
static void disp(char type)
{
System.out.println("movie catagory"+type);
}
static void disp(int no,char type)
{
System.out.println("duration time"+no+"movie catagory"+type);
}
static void disp(char type,int no)
{
System.out.println("movie catagory and duration time"+type+" "+no);
}
}
class Method6
{
public static void main(String[]args)
{
Movie.disp(3);
Movie.disp('u');
Movie.disp(2,'u');
Movie.disp('a',5);
}
}


