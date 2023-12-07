/*Program to print the details of a book in a Book fair by using parameterised constructor*/
import java.io.*;
import java.util.*;
class BookFair{
    String Bname;double price;double dis;
    public BookFair(String b,double p){
        Bname=b;
        price=p;
        dis=0;
    }
    void calculate(){
        if(price<=1000){
            dis=0.02*price;
            price=price-dis;
        }
        if(price>1000&&price<=3000){
            dis=0.1*price;
            price=price-dis;
        }
        if(price>3000){
            dis=0.15*price;
            price=price-dis;
        }
    }
    public void display(){
        System.out.println("The name of the book is :"+Bname);
        System.out.println("The price of the book after discount is :"+price);
    }
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        String Bname;double price;int a;
        do{
            System.out.print("Enter the name of the book");
            Bname=sc.next();
            System.out.print("Enter the price");
            price=sc.nextDouble();
            BookFair obj=new BookFair(Bname,price);
            obj.calculate();
            obj.display();
            System.out.print("If any more book is there press 1");
            a=sc.nextInt();
        }while(a==1);
    }
}