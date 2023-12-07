import java.io.*;
import java.util.*;
class SortSS{
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        int a[]=new int[10];int t=0;int min=0;
        for(int i=0;i<10;i++){
            System.out.print("Enter the element");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<9;i++){
            min=i;
            for(int j=i+11;j<10;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        for(int i=0;i<10;i++){
            System.out.println("the element"+a[i]);
        }
    }
}