//Program to print the eligibility of a Student
import java.io.*;
import java.util.*;
class Student{
    String name;int mm;int scm;int comp;int totm=300;int tots=0;int k=0;
    void Student(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of the name of the Student:");
        name=sc.next();
        System.out.print("Enter the marks in Math");
        mm=sc.nextInt();
        System.out.print("Enter the marks in science");
        scm=sc.nextInt();
        System.out.print("Enter the marks in computer");
        comp=sc.nextInt();
    }
    void check(){
        int a=0;int b=0;int c=0;int av=0;
        a=(mm/totm)*100;
        b=(scm/totm)*100;
        c=(comp/totm)*100;
        av=(a+b+c)/3;
        if(a>=90&&b>=90&&c>=90){
            k=k+1;
        }
        if(av>=90){
            k=k+2;
        }
        if(av>=80&&av<90){
            k=k+3;
        }
    }
    void display(){
        if(k==1){
            System.out.println("The student name is "+name+"and he/she should take Science and Computer in class XI");
        }
        if(k==2){
            System.out.println("The student name is "+name+"and he/she should take Bio-Science in class XI");
        }
        if(k==3){
            System.out.println("The student name is "+name+"and he/she should take Science and Hindi in class XI");
        }
        else{
            System.out.println("The student name is "+name+"he/she is not eligible");
        }
    }
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        int j;
        do{
            Student obj=new Student();
            obj.check();
            obj.display();
            System.out.print("If there  is any more student press 1");
            j=sc.nextInt();
        }while(j==1);
    }
}
            