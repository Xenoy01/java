//To replace the vowels with any chatacter
import java.io.*;
import java.util.*;
class String3{
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        //Declaring of variables
        String s;char d;int len;char b;int x=0;char e='.';
        System.out.print("Enter the string:");
        s=sc.nextLine();
        len=s.length();
        System.out.print(s.charAt(0));
        System.out.print(e);
        x=s.indexOf(' ');
        for(int y=(x+1);y<len;y++)
        System.out.print(s.charAt(y));
        }
    }
    