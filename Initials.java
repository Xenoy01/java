//Progrm to print initials of any name entered
import java.io.*;
import java.util.Scanner;
class Initials{
        public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        //Declaring of variables
        String s;int len=0;char d;char b;
        //Enter any string
        System.out.print("Enter any string:");
        s=sc.nextLine();
        //Calculating the length of the string
        len=s.length();
        //Printing the first initials
        System.out.print(s.charAt(0));
        //Checking for blank space and printing the remaining initials
        for (int i=0;i<len;i++){
            b=s.charAt(i);
            if(b==' ')
            System.out.print(s.charAt(i+1));
        }
    }
}

            