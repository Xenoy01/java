//Program to print the initials
import java.io.*;
import java.util.*;
class String2{
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        String s;int len=0;char d;char b;
        System.out.print("Enter the String:");
        s=sc.nextLine();
        len=s.length();
        System.out.print(s.charAt(0));
        for(int i=0;i<len;i++){
            b=s.charAt(i);
            if(b==' ')
            System.out.print(s.charAt(i+1));
        }
    }
}