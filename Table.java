//Multiplication table of any given number tillthe count of 10 using for loop
import java.io.*;
import java.util.Scanner;
class Table{
public static void main (String args[])throws Exception{
Scanner sc=new Scanner(System.in);
//Declaring of variables 
int n;int m=0;
//Enter any number whose multiplication table to be displayed
System.out.println("Enter the number whose table tobe displayed:");
n=sc.nextInt();
//Printing the table using for loop
for(int i=1;i<=10;i++){
m=n*i;
System.out.println(n+"x"+i+"="+m);
}
}
}