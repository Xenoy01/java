//Class print the sum of two numbers
import java.io.*;
import java.util.*;
class Exam{
    int a;int b;int c;
    void Exam(){
         a=0; b=0; c=0;
    }
    void inp(){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the first no.");
        a=sc.nextInt();
        System.out.print("Enter the second no.");
        b=sc.nextInt();
    }
    void calc(){
         c=a+b;
    }
    void dis(){
       System.out.print("The sum is"+c);
    }
    public static void main (String args[]){
        Exam ob=new Exam();
        ob.inp();
        ob.calc();
        ob.dis();
    }
}
