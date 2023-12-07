import java.io.*;
import java.util.*;
class Fab{
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        int a;int b;int c;int n;
        a=0;b=1;c=0;n=3;
        System.out.println("the Eabonacci Series is");
        System.out.println(a);
        System.out.println(b);
        do{
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            n++;
        }
        while(n<=10);
    }
}