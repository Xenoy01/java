import java.io.*;
import java.util.*;
class StringM{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s;int a;int b;String p="";
        System.out.print("Enter the String:");
        s=sc.nextLine();
        s=s+" ";
        a=s.length();
        for(int i=0;i<a;i++){
             b=(int)(s.charAt(i));
             if(b>=97&&b<=122){
                 b=b-32;
                 p=p+((char)(b));
                }
             else if((s.charAt(i))!=(' ')){
                 b=b+32;
                 if((s.charAt(i+1))==' '){
                 p=p+((char)(b))+" ";
                }
                else
                p=p+((char)(b));
            }
        }
        System.out.print("New string"+p);
    }
}