//Program to print the maximum marks of a Student
import java.io.*;
import java.util.*;
class StudentMax_Avg{
    String name;int age;int m1;int m2;int m3;int maximum;int avg;
    void Student(){
        name="";
        age=0;
        m1=0;
        m2=0;
        m3=0;
        maximum=0;
        avg=0;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of the Student");
        name=sc.next();
        System.out.print("Enter the age of the Student");
        age=sc.nextInt();
        System.out.print("Enter the marks in first subject");
        m1=sc.nextInt();
        System.out.print("Enter the marks in second subject");
        m3=sc.nextInt();
        System.out.print("Enter the marks in third subject");
        m2=sc.nextInt();
    }
    void compute(){
        avg=(m1+m2+m3)/3;
        if(m1>m2&&m1>m3)
        maximum=m1;
        if(m2>m1&&m2>m3)
        maximum=m2;
        if(m3>m1&&m3>m2)
        maximum=m3;
    }
    void display(){
        System.out.println("The name of the student is"+name);
        System.out.println("The age of the student is"+age);
        System.out.println("The mark of the student in first subject"+m1);
        System.out.println("The mark of the student in second subject"+m2);
        System.out.println("The mark of the student in third subject"+m3);
        System.out.println("The average mark of the student is"+avg);
        System.out.println("The maximum mark of the student is "+maximum);
    }
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        int z;
        do{
            StudentMax_Avg obj=new StudentMax_Avg();
            obj.input();
            obj.compute();
            obj.display();
            System.out.print("If there is any more Student press 1");
            z=sc.nextInt();
        }while(z==1);
    }
}