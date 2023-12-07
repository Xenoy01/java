import java.io.*;
import java.util.Scanner;
class INt{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        String s;int len=0;char d;char b;char e='.';int x=0;
        System.out.print("Enter any String");
        s=sc.nextLine();
        System.out.print(s.charAt(0));
        System.out.print(e);
        len=s.length();
        for(int i=0;i<len;i++){
            b=s.charAt(i);
            if(b==' '){
                x=i+1;
                break;
            }
        }
        for(int v=x;v<len;v++)
        System.out.print(s.charAt(v));
    }
}
        