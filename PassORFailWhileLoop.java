import java.io.*;
import java.math.*;
import java.util.Scanner;
class PassORFailWhileLoop{
public static void main  (String args[]) throws Exception{
Scanner sc=new Scanner(System.in);
//Declaring of variables
int s;float m;float tot=0;float per=0;float totm=0;int p=0;int f=0;int d=1;
//Enter the total number of subject taught in the class   
 System.out.print("Enter the no. of subject:");
 s=sc.nextInt();
 totm=s*20;
//While loop begins for student
 while(d==1){//Outer loop for students
   for(int j=1;j<=s;j++){//Inner loop for subjects
     System.out.print("Enter the marks:");
     m=sc.nextFloat();
     tot=tot+m;
  }//Inner loop closed
  //Calculating the total percentage
  per=(tot/totm)*100;
  //Checking for pass or fail
  if (per>=69)
     p++;
  else
     f++;
  tot=0;per=0;
  //Asking for any more student 
  System.out.print("Any more student in the class if yes press1:");
  d=sc.nextInt();
}
System.out.println("Number of student pass are :"+p);
System.out.print("Number of student failed are :"+f);
}
}