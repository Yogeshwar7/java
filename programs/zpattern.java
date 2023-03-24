

import java.util.Scanner;

public class zpattern {
    public static void main(String args[] ) 
    {
        int row,column;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(row=1;row<=n;row++)
        {
            for(column=1;column<=n;column++)
            {
                if(row==1||row+column==n+1||row==n)
                {
                    System.out.print(+column);
                }
                else
                {
                    System.out.print(" ");                
                }
            }
        }
    }
}
