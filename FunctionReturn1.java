//Program to check wrether a given no. is a prime no. or not
import java.io.*;
import java.util.Scanner;
import java.math.*;
class FunctionReturn1{
    public static int prime (int num){
        int a=0;int b=0;
        for (int i=1;i<=num;i++){
            a=num%i;
            if (a==0){
                b=b+1;
            }
        }
        return b;
    }
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        int n;int d=0;
        System.out.print("Enter the  number :");
        n=sc.nextInt();
        d=prime(n);
        if(d==2)
        System.out.print(n+"is a prime number");
        else
        System.out.print(n+"is not a prime number");
        System.out.print("lollollollollollollollollollollollollollollollollollollollollollollollollollollollollollollollollolllolllollollo");
        System.out.print("kokokokokokokokokokokokokokokkokokokokokokokokokokokokokokokokokokokokokokokokokokokokokokokokokokokokokokokokok");
    }
}