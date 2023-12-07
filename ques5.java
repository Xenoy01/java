import java .util.*;
class ques5 {
public static void main(String args[]) {
Scanner obj = new Scanner (System.in);
int choice,x; System.out.println("Enter 1 pattern1 , 2 Pattern2");
choice =obj.nextInt();
switch(choice) {
case 1: int r, c, k = 1;
for (r = 1; r <= 5 ; r ++) {
for (c=1;c<=r;c++) {
System.out.print(" "+k);
k++; }
System.out.println(); }
break;
case 2:
String s="ÏCSE";
for(int i=0;i<s.length();i++ ) {
System.out.println(s.substring(0,i+1)); }
break;
default : System.out.println("Sorry wrong choice");
}
}
}