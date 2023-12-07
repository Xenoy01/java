//Program to print the area of the geometrical figure using if or else
import java.io.*;
import java.math.*;
import java.util.Scanner;
class AreaSwitch{
public static void main  (String args[]) throws Exception{
Scanner sc=new Scanner(System.in);
//Declaring of variables
int ch;float s;float areasq=0;float l;float b;float arearec=0;double r=0;float ba;float hg;double areatri=0;double pi=3.14;float ra;double areacir=0;
//Displaying the main menu
System.out.println("MAIN MENU:");
System.out.println("1:SQUARE");
System.out.println("2:RECTANGLE");
System.out.println("3:TRIANGLE");
System.out.println("4:CIRCLE");
System.out.print("Enter your choice:");
ch=sc.nextInt();
//Progam to work as per given choice using if-else
switch (ch){
case 1:
//Program for square
System.out.print("Enter the size of the side:");
s=sc.nextFloat();
areasq=s*s;
System.out.print("Area of the square is:"+areasq);
case 2:
//program for rectangle
System.out.print("Enter the size of length:");
l=sc.nextFloat();
System.out.print("Enter the size of breadth:");
b=sc.nextFloat();
arearec=l*b;
System.out.print("Area of the rectangle is:"+arearec);
case 3:
//program for triangle
System.out.print("Enter the size of base:");
ba=sc.nextFloat();
System.out.print("Enter the size of height:");
hg=sc.nextFloat();
areatri=0.5*ba*hg;
System.out.print("Area of triangle is:"+areatri);
//program for circle
case 4:
System.out.print("Enter the size of radius:");
ra=sc.nextFloat();
r=Math.pow(ra,2);
areacir=pi*r;
System.out.print("Area of circle is:"+areacir);
default :
System.out.println("You have entered a WRONG CHOICE");
}
}
}





