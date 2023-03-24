
import java.util.Arrays;

public class arrayfact{
    public static void main(String args[])
    {
       int arr[]=new int[]{5,6,8,12};
       int a[]=new int[4];
       int n=arr.length;
       

       for(int i=0;i<n;i++)
       {
        int len =1;
        for(int j=1;j<=arr[i]/2;j++)
        {
            if(arr[i]%j==0)
            {
                len++;
            }
        }
        a[i]=len;
        
       }
       System.out.print(Arrays.toString(a));

       int temp;
       for(int k=0;k<a.length-1;k++)
       {
        if(a[k]<a[k+1])
        {
            temp=a[k];
            a[k]=a[k+1];
            a[k+1]=temp;
            temp=arr[k];
            arr[k]=arr[k+1];
            arr[k+1]=temp;
        }
       }
       
    
         System.out.print(Arrays.toString(arr));
        
    }
}