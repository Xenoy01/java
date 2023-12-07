import java.io.*;
import java.util.Scanner;
class Trees{
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        int a=0;int b=0;int c=0;int d=0;
        //program for mango tree
        int i;
        do{
            System.out.println("If a mango is fallen press 1 if no then press any no.");
            i=sc.nextInt();
            if(i==1){
                a++;
            }
        }while(i==1);
        if(a!=0){
         System.out.println("The no. of mango are:"+a);
        }     
        //program for guava
        int f;
        do{
            System.out.println("If a guava is fallen press 2 if no then press any no.");
            f=sc.nextInt();
            if(f==2){
                b++;
            }
        }while(f==2);
         if(b!=0){
         System.out.println("The no. of guava are:"+a);
        }
        //program for apple
        int g;
        do{
            System.out.println("If a apple is fallen press 3 if no then press any no.");
            g=sc.nextInt();
            if(g==1){
                c++;
            }
        }while(g==3);
         if(c!=0){
         System.out.println("The no. of apple are:"+c);
        }
        //program for orange
        int y;
        do{
            System.out.println("If a orange is fallen press 1 if no press any no.");
            y=sc.nextInt();
            if(y==4){
                d++;
            }
        }while(y==4);
        if(d!=0){
          System.out.println("The no. of orange are:"+a);
         }    
    }
}        
