import java.io.*;
import java.util.Scanner;
class LinearSearch{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner (System.in);
        int a[]={5,3,2,8,5,4,9,6,7,5};int v;
        System.out.print("Enter the no. To be searched");
        v=sc.nextInt();
        int flag=0;int k=0;
        for(int i=0;i<10;i++){
            if(v==a[i]){
                flag=1;
                k=i;
                break;
            }
        }
        if(flag==1)
        System.out.println(v+"is present at position"+(k+1));
        else
        System.out.println("element not found");
    }
}
/*System.out.print("Enter the size of the Array");
 n=sc.nextInt();
 for(int i=0;i<n;i++){
 System.out.print("Enter the first size");
 a[i]=sc.nextInt()
}*/