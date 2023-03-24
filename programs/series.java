import java.util.Scanner;

public class series{
    public static void main (String args[])
    {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the n");
        n=in.nextInt();
        while(n>1)
        {
            if(n%2==0)
            {
                n=n/2;
                System.out.print(n +" ");
            }
            else
            {
                n=n*3+1;
                System.out.print(n +" ");
            }
        }

    }
}