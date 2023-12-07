import java.io.*;
import java.util.Scanner;
class State{
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        String state[]=new String [2];String cap[]=new String[2];String r;int flag=0;
        for(int i=0;i<2;i++){
            System.out.print("Enter the name of state:");
            state[i]=sc.next();
            System.out.print("Enter the capital of the state:");
            cap[i]=sc.next();
        }
        System.out.print("Enter the name of the state for the corresponding capital:");
        r=sc.next();
        for(int i=0;i<2;i++){
            if(r==state[i]){
                flag=1;
                break;
            }
        
        if(flag==1){
                System.out.println("State is"+r+"corresponding capital is"+cap[i]);
            }
            else;
            System.out.println("Sorry not found");
            
        
      }
    }
  }
        
          