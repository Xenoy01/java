import java.io.*;
import java.util.*;
class Zack{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a;int l;String str=" ";int sum=0;
        System.out.print("Enter the char");
        a=sc.next();
        l=a.length();
        for(int i=l-1;i>=0;i--){
           str=str+(a.charAt(i));
        }
        System.out.print("Early String="+a+"new String="+str);
        int y=1555;
        do{
            int q=y/10;
            int r=y%10;
            sum=sum+r;
            y=q;
        }while(y!=0);
        System.out.print("The sum="+sum);
    }
}