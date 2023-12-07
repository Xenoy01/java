import java.io.*;
import java.util.*;
class String4{
    public static void main(String a[])throws Exception{
        Scanner sc=new Scanner (System.in);
        int n;String s;int l;
        System.out.print("Enter the no.");
        n=sc.nextInt();
        s=Integer.toString(n);
        l=s.length();
        System.out.println(l);
        for(int i=l-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
