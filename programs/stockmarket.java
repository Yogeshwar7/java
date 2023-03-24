import java.util.Scanner;

public class stockmarket{
    public static void main(String args[])
    {
        int i,n,j,profit,profit1=0,overallprofit=0,buy=0,sell=0;
        System.out.print("Array size");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int arr[]=new int[n];
        
        for(i=0;i<n;i++)
        {
         arr[i]=in.nextInt();
        }

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                profit=arr[j]-arr[i];
                if(profit1<profit)
                {
                    
                    profit1=profit;
                    sell=j;
                    buy=i;
                }
            }
         
        }
        System.out.println("profit is"+profit1);
        System.out.println("buy"+buy);
        System.out.println("sell"+sell);
    }
}