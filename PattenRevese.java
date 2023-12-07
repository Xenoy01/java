//program to print the patten
import java.io.*;
import java.util.*;
class PattenRevese{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        String a;int k=0;
        System.out.print("Enter the String");
        a=sc.next();
        a=a+" ";
        int l=a.length();
        for(int i=l;i>=0;i--){
            for(int w=0;w<k;w++){
            System.out.print(" ");
          }
          System.out.print(a.substring(0,i));
          k++;
          System.out.println();
        }
    }
}
            