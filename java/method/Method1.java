class Shop
{
void buy(int no)
{
System.out.println("no.of items"+no);
}
void buy(String product)
{
System.out.println("kind of product");
}
void buy(int no,String product)
{
System.out.println("no.of items"+no+"kind of product"+product);
}
void buy(String product,int no)
{
System.out.println("kind of product and no.of items"+product+" "+no);
}
}
class Method1{
public static void main(String[]args)
{
Shop s1=new Shop();
s1.buy(4);
s1.buy("toy");
s1.buy(3,"choc");
s1.buy("food",4);
}
}



