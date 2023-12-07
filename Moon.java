import java.io.*;
import java.util.Scanner;
class Moon {
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        int posmax=0;int posmin=0;
        int a[]=new int[5];
        for (int i=0;i<5;i++){
            System.out.print("Enter the mark of the Student:");
            a[i]=sc.nextInt();
        }
        int max=a[0];int min=a[0];
        for (int i=0;i<5;i++){
            if(a[i]>max){
               max=a[i];
               posmax=i;
            }
        }
         for (int i=0;i<5;i++){
            if(a[i]<min){
               min=a[i];
               posmin=i;
            }
        }
        System.out.println("Highest mark:"+max+"position is:"+(posmax+1));
        System.out.println("Lowest mark:"+min+"position is:"+(posmin+1));
    }
}