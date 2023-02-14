class Ola
{
void ride(int no)
{
System.out.println("no of peoples"+no);
}
void ride(String veh)
{
System.out.println("type of vehicle"+veh);
}
void ride(String veh,int no)
{
System.out.println("type of vehicle and no of peoples"+veh+" "+no);
}
void ride(int no,String veh)
{
System.out.println("no of peoples and type of vehicle"+no+" "+veh);
}
}
class Overloading
{
public static void main(String[]args)
{
Ola o1=new Ola();
o1.ride(4);
o1.ride("premium");
o1.ride("premium",5);
o1.ride(7,"premium");
}
}

