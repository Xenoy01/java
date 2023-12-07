/**Program to print the area of square,triangle,rectangle,circle by cteating a function named
 * area()
 */
import java.io.*;
import java.util.*;
import java.math.*;
class FunctionOverloding1{
    //For triangle
    public double area(double ba1,double ht1){
        double artri=0.0;
        artri=(0.5*ba1*ht1);
        return artri;
    }
    //For square
    public double area(float s1){
        double arsqr=0;
        arsqr=(Math.pow(s1,2));
        return arsqr;
    }
    //For cricle
    public double area(double r1){
        double arcir=0.0;
        arcir=(3.14*(Math.pow(r1,2)));
        return arcir;
    }
    //For rectangle
    public double area(float l1,float b1){
        double arrec=0.0;
        arrec=(l1*b1);
        return arrec;
    }
    //Main Function
    public  void main(String args)throws Exception{
        Scanner sc=new Scanner(System.in);
        float s;double sqr=0.0;float l;float b;double rec=0.0;double ba;double ht;
        double tri=0.0;double r;double cir;
        //For square
        System.out.print("Enter the side of the square:");
        s=sc.nextFloat();
        sqr=area(s);
        System.out.print("The area of the square of side"+s+"is:"+sqr);
        //For rectangle
        System.out.print("Enter the length of the rectangle:");
        l=sc.nextFloat();
        System.out.print("Enter the breadth of the rectangl:");
        b=sc.nextFloat();
        rec=area(l,b);
        System.out.print("The area of the rectangle of length"+l+"and breadth"+b+"is"+rec);
        //For circle
        System.out.print("Enter the radius of the circle:");
        r=sc.nextDouble();
        cir=area(r);
        System.out.print("The area of the circle of radius"+r+"is"+cir);
        //For triangle 
        System.out.print("Enter the height of the triangle:");
        ht=sc.nextDouble();
        System.out.print("Enter the base of the triangle:");
        ba=sc.nextDouble();
        tri=area(ba,ht);
        System.out.print("The area of the triangle of base"+ba+"and height"+ht+"is:"+tri);
    }
}