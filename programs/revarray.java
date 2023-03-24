import java.util.*;
public class revarray{
    public static void main(String args[])
    {
        int i,length,n,temp;
        Scanner in=new Scanner(System.in);
        System.out.print("Array size");
        n=in.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        
      System.out.print(Arrays.toString(arr));
        length=arr.length;
        for(i=0;i<length/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.print(Arrays.toString(arr));

    }
}