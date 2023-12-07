import java.io.*;
import java.util.*;
class SortBB{
   public static void main (String args[])throws Exception{
    Scanner sc=new Scanner(System.in);
    String a[]=new String[10];String t=" ";
    for(int i=0;i<10;i++){
        System.out.println("Enter the element");
        a[i]=sc.next();
    }
    for(int i=0;i<10;i++){
        for(int j=0;j<9;j++){
            if((a[j].compareTo(a[j+1]))>0){
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
    }
    for(int i=0;i<10;i++){
        System.out.println("the element"+a[i]);
    }
  }
}
