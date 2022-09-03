import java.io.*;
import java.util.*;
public class sdigit
{
public static void main(String args[])
{
 int n,r,sum=0;
 Scanner in=new Scanner(System.in);
 System.out.println("Enter the number:");
 n=in.nextInt();
do{ 
while(n>0)
 {
  r=n%10;
  sum=sum+r;
  n=n/10;
}
   n=sum;
   sum=0;
}while(n>10);
System.out.println("the single digit is:"+n);
} 
}
 
 