import java.io.*;
import java.util.*;
class Patten{
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        //Declaring of variales
        String s;int l;
        System.out.print("Enter the string:");
        s=sc.next();
        l=s.length();
        for(int i=0;i<=l-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println("");
        }
    }
}