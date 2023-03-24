import java.util.*;
public class insert{
    public static void main(String args[])
    {
        int i,n;
        Scanner in=new Scanner(System.in);
        int arr[]=new int[20];
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]+1==arr[i+1]-1)
            {
                n++;
             
                for(int j=n-1;j>=i+2;j--)
                {
                  
                   arr[j]=arr[j-1];
                   
                }
                arr[i+1]=arr[i]+1;
                
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
