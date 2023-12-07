import java.io.*;
import java.util.Scanner;
class Employee{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        String n;int s;int t=0;int p=0;
        System.out.print("Enter the name of the employee");
        n=sc.nextLine();
        System.out.print("Enter the Salary");
        s=sc.nextInt();
        if(s==20000||s<20000){
            System.out.print("No tax");   
        }
        else if(s>20000&&s<40000){
           t=s*20/100;
           p=s-t;
           System.out.println("The Salary after reducing the tax is:"+p);
        }
        else if(s>40000&&s<60000){
            t=s*40/100;
            p=s-t;
            System.out.println("The Salary after reducing the tax is:"+p);
        }
    }
}