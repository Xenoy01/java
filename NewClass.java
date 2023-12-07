//Multiplication table of any given number till the count of 10 using do while loop
import java.io.*;
import java.util.Scanner;
class NewClass{
public static void main (String args[])throws Exception{
Scanner sc=new Scanner(System.in);
//Declaring of variables 
int n;int m=0;int b=1;
//Enter any number whose multiplication table to be displayed
System.out.println("Enter the number whose table to be displayed:");
n=sc.nextInt();
//Printing the table using a for loop
while(b<=10){
m=n*b;
System.out.println(n+"x"+b+"="+m);
b++;
}
}
}