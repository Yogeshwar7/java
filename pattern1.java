import java.io.*;
import java.util.Scanner;
public class pattern1
{
 public static void main(String args[])
 {
 int i,j;
 int odd=1;
 int even=2;

 for(i=1;i<=2;i++)
    {
     for(j=4;j<=i;j--)
      {
        if(j % 2!=0)
        {
        System.out.print("+odd");
        odd=odd+2;
        }
        else
        {
        System.out.print("+odd");
        even=even+2;
        }
      }
    System.out.println();

    }
 }
}
