import java.io.*;
import java.util.*;
class Search{
    public static void main(String args[]){
        int a[]={5,6,9,8,4,7,1,2,5,5,};int l;
        l=a.length;int mv;int mi;int t;
        for(int i=0;i<l-1;i++){
            mv=a[i];
            mi=i;
            for(int j=i+1;j<l;j++){
                if (a[j]<mv){
                    mv=a[j];
                    mi=j;
                }
            }
            t=a[i];
            a[i]=a[mi];
            a[mi]=t;
        }
        for(int i=0;i<l-1;i++)
        System.out.print("A"+a[i]);
    }
}
        