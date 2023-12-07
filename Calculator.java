import java.io.*;
import java.util.Scanner;
class Calculator{
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        int ch;float a;float b;float c=0;int d;
        System.out.print("Enter the first no.:");
        a=sc.nextInt();
        System.out.println("Enter the second no.:");
        b=sc.nextInt();
        do{
         System.out.println("The choices are:");
         System.out.println("1:Addition");
         System.out.println("2:Subtraction");
         System.out.println("3:Multiplication");
         System.out.println("4:Divisoin");
         ch=sc.nextInt();
         if(ch==1){
            c=a+b;
            System.out.println("Your answer is:"+c);
         }
         else if(ch==2){
            c=a-b;
            System.out.println("Your answer is:"+c);
         }
         else if(ch==3){
            c=a*b;
            System.out.println("Your answer is:"+c);
         }
         else if(ch==4){
            c=a/b;
            System.out.println("Your answer is:"+c);
         }
         else
            System.out.println("Your choice is wrong");
         System.out.println("If you want to do any thing more then press 1 if not then press any thing");
         d=sc.nextInt();
         if(d==1){
           a=c;
           System.out.println("Enter the new no.:");
           b=sc.nextInt();}
      }while(d==1);
    }
}
       
        
        