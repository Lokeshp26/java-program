class Bike
{
int bikecost;
static String bikebrand="veshpa";
String bikecolor;
public static void main(String[]args)
{
System.out.println(bikebrand);
Bike b1=new Bike();
b1.bikecost=39888;
System.out.println(b1.bikecost);
Bike b2=new Bike();
b2.bikecolor="white";
System.out.println(b2.bikecolor);
b2.bikecolor="black";
System.out.println(b2.bikecolor);
}
}