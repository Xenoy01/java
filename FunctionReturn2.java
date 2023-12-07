//program to print the armstong number
import java.io.*;
import java.util.*;
import java.math.*;
class FunctionReturn2{
    public static int arm(int num){
        //Declaring of variables
        int a=0;int b=0;int c=0;int sum=0;
        do{
            a=num%10;
            b=num/10;
            c=a*a*a;
            sum=sum+c;
            num=b;
        }while(b!=0);
        return sum;
    }
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        //Declaring of variables
        int n;int d=0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        d=arm(n);
        if(d==n)
        System.out.println(n+"is a armstong number");
        else
        System.out.println(n+"is not a armstong number");
    }
}