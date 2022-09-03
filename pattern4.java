import java.io.*;
import java.util.Scanner;
public class pattern4
{
public static void main(String args[])
{
int i,j;
int odd=1;
int even=8;

for(i=1;i<=2;i++)
  {
   for(j=1;j<=4;j++)
   {
    if(i%2==0)
      {
       System.out.print(+even);
       even=even-1;
      }
    else
      {
       System.out.print(+odd);
       odd=odd+1;
      }
   }
System.out.println();

  }

int odd1=9;
int even2=16;

for(i=1;i<=2;i++)
{
  for(j=1;j<=4;j++)
  {
   if(i%2==0)
     {
      System.out.print(+even2);
      even2=even2-1;
     }
   else
      {
       System.out.print(+odd1);
       odd1=odd1+1;
      }
  }
System.out.println();
}
}
}
      