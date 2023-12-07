//Program to print anumber in reverse with the sum of their digits
import java.io.*;
import java.util.*;
class ReverseSum{
   public static void reversesum(int num){
       int r=0;int q=0;int sum=0;
       System.out.print("Reverse no. is");
       do{
            r=num%10;
            q=num/10;
            sum=sum+r;
            System.out.println(r);
            num=q;
        }while(q!=0);
       System.out.print("The sum is"+sum);
    }
   public static void main(String args[])throws Exception{
       Scanner sc=new Scanner (System.in);
       int n;
       System.out.print("Enter the no.");
       n=sc.nextInt();
       reversesum(n);
    }
}