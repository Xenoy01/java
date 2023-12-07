//to check the function
import java.io.*;
import java.util.*;
class Check{
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];int l;int q;
        for(int i=0;i<10;i++){
            System.out.println("enter the no.");
            n[i]=sc.nextInt();
        }
        l=n.length;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1;j++){
                if(n[j]>n[j+1]){
                    q=n[j];
                    n[j]=n[j+1];
                    n[j+1]=q;
                }
            }
        }
        for(int i=0;i<l;i++)
        System.out.println("w"+n[i]);
    }
}