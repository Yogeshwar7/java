import java.io.*;
import java.util.Scanner;
 public class pattern3
{
  public static void main(String args[])
  {
   int i,j;
   int odd=1,even=2;
   for(i=1;i<=4;i++)
      {
        for(j=1;j<=4;j++)
           {
            if(j % 2==0)
            {
             System.out.print(+even);
             even=even+4;
            }
            else
            {
             System.out.print(+odd);
             odd=odd+4;
            }
           }
        odd=odd-2;
        even=even-2;
        System.out.println();
      
     }
  
  }
}

             
 