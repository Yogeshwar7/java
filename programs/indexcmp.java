import java.util.*;
public class indexcmp{
    public static void main(String args[])
    {
        int i,j=0,temp=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Array size");
        int n;
        n=in.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        for(i=0;i<n;i+=2)
        {
            j=i+1;
                if(j<n)
                {
                    if(arr[i]>arr[j])
                    {
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }    
                

            
        }
        System.out.print(Arrays.toString(arr));
        }  
    }
           
    
        
    
