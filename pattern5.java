import java.io.*;
import java.util.Scanner;
public class pattern5
{
public static void main(String args[])
{
int i,j;
int odd=1,even=2;
int odd1=5,even2=6;
for(i=1;i<=4;i++)
{
 for(j=1;j<=2;j++)
    {
     if(j<=2)
       {
        if(j%2==0)
          {
           System.out.print(+even);
           even=even+2;
          }
       else
          {
          System.out.print(+odd);
          odd=odd+2;
          }
        }
      if(j<=4)           
         {
           if(j%2==0)
             {
              System.out.print(+even2);
              even2=even2+2;
             }
           else
              {
               System.out.print(+odd1);
               odd1=odd1+2;
              }
         }
       }
     
System.out.println();
}
}
}

    
     