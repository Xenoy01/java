//To find the volume and digonal of a cuboid.
public class Adarsh
{
public static void main(int  a,int b,int c)
{
int volume=0;
double digonal=0;
int s=0;
volume=(a*b*c);
digonal=Math.sqrt(a*b+c*b+a*c);
s=a*b+c;
System.out.println("The volume of cuboid="+volume);
System.out.println("The digonal of cuboid="+digonal);
System.out.println("The total surface area of cuboid="+s);
}
}