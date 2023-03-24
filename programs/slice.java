import java.util.Arrays;
import java.util.Scanner;

public class slice{
    public static void main (String args[])
    {
        int n,i,j;
        System.out.println("enter size");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int count1=n;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
           if(arr[i]==arr[j])
           {
            //count=count+1;
            count1=count1-1;
           }
           }

           
    }
       
       System.out.print(count1);
        }
        
    }
