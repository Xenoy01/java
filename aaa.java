 //Program from 10
import java.io.*;
import java.util.*;
class aaa{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        int a=1;int z;int sum=0;
        System.out.print("Enter the no.");
        z=sc.nextInt();
        int n=z;
        do{
            int q=n/10;
            int r=n%10;
            sum=sum+n;
            n=q;
            a++;
        }while(n!=1);
        int b[]=new int[a];
        for(int i=0;i<a;i++){
            b[i]=i;
        }
        for(int i=0;z!=1;i++){
            int e=n/10;
            int p=n%10;
            b[i]=p;
            n=e;
        }
        for(int i=0;i<a;i++)
        System.out.println("[[["+b[i]);
    }
}
class Inc{
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int sum=0;int n;
        System.out.print("Enter the no.");
        n=sc.nextInt();
        for(int i=1;i<n;i++){
            sum=sum+(i*(i+1));
        }
        System.out.print(" the no."+sum);
    }
}