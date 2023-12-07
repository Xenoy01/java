//To print the total 
import java.io.*;
import java.util.Scanner;
class ArrayTotal{
 public static void main (String args[])throws Exception{
     Scanner sc=new Scanner(System.in);
     //declaring of variables
     int a[]=new int[10];int tot=0;
     //Entering the no. in the Array
     for(int i=0;i<10;i++){
         System.out.print("Enter any number:");
         a[i]=sc.nextInt();
         //Calculating the total sum
         tot=tot+a[i];
        }
        System.out.print("there total is:"+tot);
    }
}