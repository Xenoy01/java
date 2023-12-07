//program for merg
import java.io.*;
import java.util.*;
class Merg{
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        int a[]=new int[10];int b[]=new int[5];int c;int d;
        c=a.length;
        d=b.length;
        for(int i=0;i<c;i++){
            System.out.print("Enter a:");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<d;i++){
            System.out.print("Enter b:");
            b[i]=sc.nextInt();
        }
        int k=c+d;
        int r[]=new int[k];int j=0;
        for(int i=0;i<c;i++){
            r[i]=a[i];
        }
        for(int i=k-d;i<k;i++){
            r[i]=b[j];
            j++;
        }
        for(int i=0;i<k;i++)
            System.out.println(r[i]);
        }
    }
        
        
        
        
        
        
   