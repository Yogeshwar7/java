import java.util.*;
public class platform{
    public static void main(String args[])
    {
        int n,i;
        Scanner in=new Scanner(System.in);
        System.out.print("enter size:");
        n=in.nextInt();
        int platform=0;
        int mim=0;
        int arr[]=new int[n];
        int dep[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            dep[i]=in.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(dep);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(dep));
        
        int j=0;
        int k=0;
        while(k<n && j<n)
        {
            if(arr[k]<dep[j])
            {
                platform++;
                k++;
            }
            else{
                platform--;
                j++;
            }
            if(platform>mim){
                mim=platform;
            }
        }
         System.out.print(mim);
        }
        
    }
