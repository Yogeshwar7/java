import java.util.Scanner;

public class fact{
    public static void main(String args[])
    {
        int n;
        Scanner in =new Scanner(System.in);
        System.out.print("enter the number");
        n=in.nextInt();

        for(int i=1;i<=n;i++)
        {
           if(n%i==0)
           {
            System.out.print(i+" ");
           }
        }


    }
}