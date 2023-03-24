import java.util.Scanner;

public class fraction{
    public static void main(String args[])
    {
        int a,b,min=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a");
        a=in.nextInt();
        System.out.print("Enter b");
        b=in.nextInt();
        if(a>b)
        {
           min=b;
        }
        else
        {
            min=a;
        }
        for(int i=min;i>1;i--)
            {
                if(a%i==0 && b%i==0)
                {
                    a=a/i;
                    b=b/i;
                }
            }
            System.out.println(+a+"/"+b +"this cannot be Simplified ");
        }
 }


