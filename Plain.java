import java.io.*;
import java.util.*;
class Plain{
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);int n=1;int nu=1;
        System.out.print("Enter n");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(nu);
                nu++;
            }
            System.out.println();
        }
        
    }
}