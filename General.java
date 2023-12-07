import java.io.*;
import java.util.*;
class General{
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        int a=12;int b=10;
        System.out.println("(a&b)="+(a&b));
        System.out.println("(a|b)="+(a|b));
        System.out.println("(a^b)="+(a^b));
        System.out.println("(a<<2)="+(a<<2));
        System.out.println("(12>>2)="+(12>>2));
        System.out.println("(14>>>2)="+(14>>>2));
    }
}