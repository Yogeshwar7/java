import java.io.*;
import java.util.*;
public class duplicate {
    
        public static void main(String args[]) 
        {
            Scanner in=new Scanner(System.in);
            int i,j,n,m,length;
            System.out.print("Array size");
            n=in.nextInt();
            int arr[]=new int[n];
            for(i=0;i<n;i++)
            {
                System.out.print("value");
                m=in.nextInt();
                arr[i]=m;
            }
            System.out.print(Arrays.toString(arr));
            length=arr.length;
            for(i=0;i<length;i++)
            {
                for(j=i+1;j<length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        arr[j]=0;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
            int temp;
            for(i=0;i<n;i++)
            {
               for(j=i+1;j<n;j++)
               {
                if(arr[i]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
               }

            }
            System.out.print(Arrays.toString(arr));

    }
}
