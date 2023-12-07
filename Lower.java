//Program to print the lower case letter
import java.io.*;
import java.util.Scanner;
class Lower{
    public static void lower (String x){
        int l;char c;
        l=x.length();
        for (int i=0;i<l;i++){
            c=x.charAt(i);
            if(Character.isLowerCase(c)==true)
            System.out.print(c);
        }
    }
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.print("Enter the String:");
        s=sc.next();
        lower(s);
    }
}