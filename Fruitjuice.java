/*To print the property of a fruit juice bby using parameterised constructor*/
import java.io.*;
import java.util.*;
class Fruitjuice{
    int product_code;String flavour;String pack_type;int pack_size;int product_price;
    Fruitjuice(int p,String f,String pt,int ps,int pp){
        product_code=p;
        flavour=f;
        pack_type=pt;
        pack_size=ps;
        product_price=pp;
    }
    void discount(){
        product_price=product_price-10;
    }
    void display(){
        System.out.println("The product code is:"+product_code);
        System.out.println("The flavour is:"+flavour);
        System.out.println("The pack type is"+pack_type);
        System.out.println("The pack size is "+pack_size);
        System.out.println("The product price before discount is"+(product_price+10)+"and after discount is"+product_price);
    }
    public static void main (String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        int product_code;String flavour;String pack_type;int pack_size;int product_price;
        int d;
        do{
            System.out.print("Enter the product code");
            product_code=sc.nextInt();
            System.out.print("Enter the flavour ");
            flavour=sc.next();
            System.out.print("Enter the pack type ");
            pack_type=sc.next();
            System.out.print("Enter the pack size  ");
            pack_size=sc.nextInt();
            System.out.print("Enter the product price");
            product_price=sc.nextInt();
            Fruitjuice obj=new Fruitjuice(product_code,flavour,pack_type,pack_size,product_price);
            obj.discount();
            obj.display();
            System.out.print("If there is any more product press 1");
            d=sc.nextInt();
        }while(d==1);
    }
}