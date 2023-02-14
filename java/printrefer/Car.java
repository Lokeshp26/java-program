class Car
{
int car_cost;
static String car_brand="skoda";
String car_color;
public static void main(String[]args)
{
System.out.println("carbrand is"+car_brand);
Car c1=new Car();
c1.car_cost=530000;
System.out.println(c1.car_cost);
Car c2=new Car();
c2.car_color="blue";
System.out.println(c2.car_color);
c1.car_cost=200000;
System.out.println(c1.car_cost);
}
}
