//Program for the details of the teacher
import java.io.*;
import java.util.*;
class Teacher{
    String t;String add;int ph;String sub;float salary;float tots=0;float tax=0;
    void input(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the name:");
        t=sc.next();
        System.out.println("Enter the address:");
        add=sc.next();
        System.out.println("Enter the phone no.:");
        ph=sc.nextInt();
        System.out.println("Enter the Subject:");
        sub=sc.next();
        System.out.println("Enter the salary");
        salary=sc.nextFloat();
    }
    void display(){
        System.out.println("name:"+t);
        System.out.println("address:"+add);
        System.out.println("phone"+ph);
        System.out.println("subject"+sub);
        System.out.println("salary"+salary);
    }
    void calculate(){
        tots=salary*12;
        if(tots>175000){
            tax=(tots-175000)*5/100;
            System.out.println("the tax is:"+tax);
        }
        else
        System.out.println("no tax");
    }
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        Teacher obj=new Teacher();
        obj.input();
        obj.display();
        obj.calculate();
    }
}