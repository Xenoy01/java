//TO print the no. of vowels
import java.io.*;
import java.util.Scanner;
class String1{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        String s;int len=0;char d;int a1=0;int e1=0;int i1=0;int o1=0;
        int u1=0;int totv=0;
        System.out.print("Enter any string:");
        s=sc.nextLine();
        len=s.length();
        for (int i=0;i<len;i++){
            d=s.charAt(i);
            if(d=='a'||d=='A')
               a1++;
            if(d=='e'||d=='E')
               e1++;
            if(d=='i'||d=='I')
               i1++;
            if(d=='o'||d=='O')
               o1++;
            if(d=='u'||d=='U')
               u1++;
            }
            totv=a1+e1+i1+o1+u1;
            System.out.println("Total no. of vowels in String"+s+"are"+totv);
        }
    }