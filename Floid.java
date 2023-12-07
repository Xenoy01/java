import java.io.*;
import java.util.*;
class Floid{
    public static void main (String args[])throws Exception{
    Scanner sc=new Scanner (System.in);
    int n=1;
    for (int i=1;i<=10;i++){
        for(int j=1;j<=i;j++){
            System.out.print(n);
            n++;
        }
        System.out.println();
    }
  }
}