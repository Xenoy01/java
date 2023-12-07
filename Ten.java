import java.io.*;
import java.util.Scanner;
import java.math.*;
class Ten{
    public static void square(int num[]){
       int a[]=new int [10];
       for(int i=0;i<10;i++){
           a[i]=num[i]*num[i];
        }
       for(int i=0;i<10;i++)
       System.out.println("the squared number is"+a[i]);
    }
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        int n[]=new int[10];
        for (int i=0;i<10;i++){
         System.out.print("Enter the number ");
         n[i]=sc.nextInt();
        }
        square(n);
    }
}