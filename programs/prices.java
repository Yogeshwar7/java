import java.util.Arrays;
import java.util.Scanner;

public class prices{
    public static void main(String args[])
    {
        int i,n,flag=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int arr[]=new int[n];
        int max=arr[0],min=arr[0],profit;
        for(i=0;i<n;i++)
        {
         arr[i]=in.nextInt();
        }
        if(n%2==1)
        {
            n--;
        }
        System.out.print(Arrays.toString(arr));

        for(i=1;i<n;i++)
        {
           
            if(max<arr[i])
            {
                if(min>max)
                {
                profit=arr[i];
                System.out.print(+profit);
                flag++;
                }
                min=max;
            }
            max=arr[i];
        }
        if(flag==0)
        {
            System.out.print("0");
        }
       

    }
}