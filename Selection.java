//program for sorting
import java.io.*;
import java.util.*;
class Selection{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];int b;int mi;int mv;
        for (int i=0;i<10;i++){
            System.out.print("Enter the no.");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<10-1;i++){
            
            mi=i;
            for(int j=0;j<10;j++){
                if(a[j]<a[mi]){
                    
                    mi=j;
                }
            }
            b=a[i];
            a[i]=a[mi];
            a[mi]=b;
        }
        for(int i=0;i<10;i++)
        System.out.println(+a[i]);
    }
}
            