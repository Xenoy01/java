import java.io.*;
import java.util.*;
class Insert{
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int a[]=new int[10];int b;int c;
        for(int i=0;i<10;i++){
            System.out.print("Enter a:");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter no:");
        b=sc.nextInt();
        System.out.print("Enter pos:");
        c=sc.nextInt();
        for(int i=8;i>=c;i--)
        a[i+1]=a[i];
        a[c]=b;
        for(int i=0;i<11;i++){
            System.out.print("k"+a[i]);
        }
    }
}