import java.io.*;
class BiggerSmaller{
    public static void main (String args[])throws Exception{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int n;int count=0;int r=0;int q=0;int num;
        System.out.print("Enter the no:");
        n=Integer.parseInt(br.readLine());
        num=n;
        do{
            r=n%10;
            count++;
            q=n/10;
            n=q;
        }while(n!=0);
        if(count<5)
          System.out.println("Small");
        else
        System.out.println("BIG");
    }
}