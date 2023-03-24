import java.util.Arrays;
import java.util.Scanner;

public class triplet{
    public static void main(String args[]) {
        int n,i,l,k,j,temp,count=1,a,b,c,max=0;
    
        System.out.println("Size");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
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
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                 arr[j]=temp;
            }
         }
        }
        System.out.println(Arrays.toString(arr));
        
        
outer:        
for(k=0;k<n;k++)
    {
        a=arr[k]*arr[k];
        
        for(l=k+1;l<n;l++)
        { 
            b=arr[l]*arr[l];
            {
                for(c=n-1;c>l;c--)
                {
                    max=arr[c]*arr[c];
                    if(max==a+b)
                    {
                        System.out.println("yes");
                        System.out.println("a:"+arr[k]+ " " + "b:"+arr[l] +" " +"max:"+arr[c]);
                        break outer;
                    }
                }
            }
         }
     
        
    }
}
}