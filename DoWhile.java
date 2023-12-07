/*Program to print the tota sum of the digits of any no.*/
import java.io.*;
import java.util.*;
class DoWhile{
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        int n;int num;int r;int q;int sum=0;
        System.out.print("Enter the number:");
        n=sc.nextInt();
        num=n;
        //Calculating the sum
        do{
            r=n%10;
            q=n/10;
            sum=sum+r;
            n=q;
        }while(n!=0);
        System.out.println("Entered no. is:"+num+"and the sum of the digits are:"+sum);
    }
}