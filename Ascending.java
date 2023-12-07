//program for Average
import java.io.*;
import java.util.*;
class Ascending{
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        String stu[]=new String[10];int m1[]=new int[10];int m2[]=new int[10];int m3[]=new int[10];
        int avg[]=new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter the name:");
            stu[i]=sc.next();
            System.out.print("Enter the m1:");
            m1[i]=sc.nextInt();
            System.out.print("Enter the m2:");
            m2[i]=sc.nextInt();
            System.out.print("Enter the m3:");
            m3[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            avg[i]=(m1[i]+m2[i]+m3[i])/3;
            System.out.print("the name:"+avg[i]);
            
        }
    }
}