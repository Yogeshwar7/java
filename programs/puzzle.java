import java.util.Scanner;

public class puzzle{
    public static void main(String args[])
    {
        int count=1,n;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter n");
        n=in.nextInt();

        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=n;column++)
            {
                if((row+column)%2==0)
                {
                    System.out.print(count++ +" ");

                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}