//Program for binary search
import java.io.*;
import java.util.*;
class Binary{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        int ns;int lb=0;int ub=9;int p=0;int q=0;int k=0;int l;
        int m[]=new int[10];
        for (int i=0;i<10;i++){
            System.out.print("Enter the no.");
            m[i]=sc.nextInt();
        }
        l=m.length;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1;j++){
                if(m[j]>m[j+1]){
                    q=m[j];
                    m[j]=m[j+1];
                    m[j+1]=q;
                }
            }
        }
        System.out.print("Enter the no. to b searched");
        ns=sc.nextInt();
        while(lb<=ub){
            p=(lb+ub)/2;
            if(m[p]<ns)
            lb=p+1;
            if(m[p]>ns)
            ub=p-1;
            if(m[p]==ns){
                k=1;
                break;
            }
        }
        if(k==1)
        System.out.print("search success");
        else
        System.out.print("search unsuccess");
    }
}
            