import java.io.*;
import java.util.*;
class Remove {
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        String s;int b;
        System.out.print("Enter the String:");
        s=sc.next();
        b=s.length();
        for(int i=b-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            for(int k=0;k<i;k++){
                System.out.print("");
            }
            System.out.println();
        }
    }
}