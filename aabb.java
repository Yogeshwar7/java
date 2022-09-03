import java.io.*;
import java.util.*;
class aabb
{
public static void main(String args[])
{
String a="a2b4";
String b;
char n;
int i,j;
for(i=0;i<a.length();i++)
   { 
    for(j=i+1;j>i;j--)
       {
        n=a.charAt(i);
        System.out.print(n*a.charAt(j));
       }      
    i=i+1;
   }
}
}