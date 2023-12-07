//Program to Check
import java.io.*;
import java.util.*;
class Inc{
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int sum=0;int n;int x=5;
        System.out.print("Enter the no.");
        n=sc.nextInt();
        for(int i=1;i<n;i++){
            sum=sum+(i*(i+1));
        }
        int x1=++x-x++ +--x;
        System.out.print(x1+" the no."+sum);
        
    }
}