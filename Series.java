//Program to print a series
import java.io.*;
import java.util.*;
import java.math.*;
class Series{
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        int a;int n;double sum=1.0;int j=1;
        System.out.print("Enter a");
        a=sc.nextInt();
        System.out.print("Enter n");
        n=sc.nextInt();
        for(int i=2;i<=n;i++){
            sum=sum+((Math.pow(a,i))/j);
            j++;
        }
        System.out.print("Sum="+sum);
    }
}
            