//Program for prime;
import java.io.*;
import java .util.*;
class Prime{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        int a;int l=0;int c=0;
        System.out.print("Enter the First no.");
        a=sc.nextInt();
        l=a+50;
        for(int i=a;i<=l;i++){
            for(int j=1;j<=i;j++){
                int e=i%j;
                if(e==0)
                c++;
                
            }
            if(c==2){
                    System.out.println(i+"is a prime no.");
                }
            
        }
    }
}