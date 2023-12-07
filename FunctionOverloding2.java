//Program to print the volume of the cube,sphere and cuboid by using function overloding
import java.io.*;
import java.util.*;
import java.math.*;
class FunctionOverloding2{
    //For cube
    public double volume(float s1){
        double arc=0.0;
        arc=(Math.pow(s1,3));
        return arc;
    }
    //For sphere
    public double volume(double r1){
        double ars=0.0;
        ars=((1.33)*(3.14)*(Math.pow(r1,3)));
        return ars;
    }
    //For cuboid
    public double volume(float l1,float b1,float h1){
        double arcu=0.0;
        arcu=l1*b1*h1;
        return arcu;
    }
    //Main program
    public   void main (String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        float s;double r;float l;float b;float h;
        double ac;double as;double acu;
        //For cube
        System.out.print("Enter the side of the cube");
        s=sc.nextFloat();
        ac=volume(s);
        System.out.print("The area of the cube of side"+s+"is"+ac);
        //For cuboid
        System.out.print("Enter the length of the cuboid:");
        l=sc.nextFloat();
        System.out.print("Enter the breadth of the cuboid:");
        b=sc.nextFloat();
        System.out.print("Enter the height of the cuboid:");
        h=sc.nextFloat();
        acu=volume(l,b,h);
        System.out.print("The area of the cuboid of length"+l+",breadth"+b+"and height"+h+"is"+acu);
        //For sphere
        System.out.print("Enter the radius of the sphere:");
        r=sc.nextDouble();
        as=volume(r);
        System.out.print("The area of the sphere of radius"+r+"is"+as);
    }
}