import java.util.Scanner;

public class pattern{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the numbers");
        int n;
        n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=5;j>=i;j--)
            {
              System.out.print(+j);
            }
            System.out.println();

            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
        }

    }
}