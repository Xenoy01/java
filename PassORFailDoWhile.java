import java.io.*;
import java.math.*;
import java.util.Scanner;
class PassORFailDoWhile{
public static void main  (String args[]) throws Exception{
Scanner sc=new Scanner(System.in);
//Declaring of variables
int s;float m;float tot=0;float per=0;float totm=0;int p=0;int f=0;int d=1;
//Enter the total number of subject taught in the class   
 System.out.print("Enter the no. of subject:");
 s=sc.nextInt();
 totm=s*20;
 //Do whileloop
 do{
     for(int i=1;i<=s;i++){
     System.out.print("Enter the mark in the subject");
     m=sc.nextFloat();
     tot=tot+m;
    }
    per=tot/totm*100;
    if(per>40)
      p++;
    else
      f++;
    tot=0;per=0;
    System.out.print("If there is any more Student press 1:");
    d=sc.nextInt();
}while(d==1);
System.out.println("The no. of student passed are"+p);      
System.out.println("The no. of student failed are"+f);
}
}      
      
      
      
     
      
      
      
      
      
     