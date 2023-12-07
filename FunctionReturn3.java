/*Program toprint the result pass or fail as return type for unknown no. of student in a
class*/
import java.io.*;
import java.util.*;
class FunctionReturn3{
     public static double transfer(String nm1,int n1){
        Scanner sc=new Scanner (System.in);
        double m;double tot=0;double per=0;double totm=100*n1;
        for(int i=1;i<=n1;i++){
            System.out.print("Enter the marks:");
            m=sc.nextDouble();
            tot=tot+m;
        }
        per=(tot/totm)*100;
        return per;
    }
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        int r=1;String nm;int n;double per1=0;String d;
        do{
            System.out.print("Enter the Students name");
            nm=sc.nextLine();
            System.out.print("Enter the number of Subject taught:");
            n=sc.nextInt();
            per1=transfer(nm,n);
            if(per1>=60){
                System.out.println("Students name is"+nm);
                System.out.println("his roll no.is"+r);
                System.out.println("his percentege is "+per1+"and he is pass");
            }
            else{
                System.out.println("Students name is:"+nm);
                System.out.println("his roll no. is"+r);
                System.out.print("his percentage is"+per1);
                System.out.println("and he is fail");
            }
            r++;
            System.out.print("Any more Student is there in the class Press y");
            d=sc.next();
        }while(d.equalsIgnoreCase("y"));
    }
}