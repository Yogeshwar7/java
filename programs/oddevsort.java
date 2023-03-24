import java.util.*;
public class oddevsort{
    
        public static void main(String args[])
        {
            int i,j,n,m;
            Scanner in=new Scanner(System.in);
            System.out.print("Array size");
            n=in.nextInt();
            int arr[]=new int[n];
            for(i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
                
            }
            System.out.print(Arrays.toString(arr));
            int temp;
            for(i=0;i<n;i++)
            {
                if(i%2==0)
                {
                    for(j=i+2;j<n;j=j+2)
                    {
                        if(arr[i]>arr[j])
                        {
                           temp=arr[i];
                           arr[i]=arr[j];
                           arr[j]=temp;
                        }
                    }
                }
                else
                {
                    for(j=i+2;j<n;j=j+2)
                    {
                        if(arr[i]>arr[j])
                        {
                           temp=arr[i];
                           arr[i]=arr[j];
                           arr[j]=temp;
                        }
                    }
                }
                i++;
            }
            System.out.print(Arrays.toString(arr));
        }
    }

