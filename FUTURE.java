import java.io.*;
import java.util.*;
class FUTURE{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int ch=0;int g=0;int o;
        //program starts
        System.out.print("If you want to know your future press 5 if no press any other key");
        g=sc.nextInt();
        if(g==5){
         System.out.println("THE CHOICES ARE : ");
         System.out.println("1");
         System.out.println("2");
         System.out.println("3");
         System.out.println("4");
         System.out.println("5");
        }
        o=sc.nextInt();
        if(o==1){
           System.out.println("Your future is that you are a Business Man");
        }
        else if(o==2){
            System.out.println("Your future is that you are a Lawer");
        }
        else if(o==3){
            System.out.println("Your future is that you are a Bank Manager");
        }
        else if(o==4){
            System.out.println("Your future is that you are a police officer");
        }
        else if(o==5){
         System.out.println("Your future is that you are a Engineer");
        }
         else{
            System.out.println("You have entered a wrong choice");
        }
    }
}
        
        
        
        
        
        
        
        
        
        